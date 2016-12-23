package ru.sbrf;

import com.rabbitmq.client.*;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class LoginServiceReceiver {

    private final String QUEUE_NAME;

    public LoginServiceReceiver(String queueName) {
        QUEUE_NAME = queueName;
    }

    private static ApplicationContext context;

    private LoginServiceImpl loginService;
    public void receive() throws java.io.IOException, java.lang.InterruptedException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                                                            byte [] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received by loginService '" + message + "'");
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);


        PropertyConfigurator.configure(LoginServiceReceiver.class.getClassLoader().getResource(
                "log4j.properties"));
        context = new ClassPathXmlApplicationContext(new String[] {"loginContext.xml"});

        LoginServiceReceiver loginServiceReceiver = new LoginServiceReceiver(QUEUE_NAME);
        loginServiceReceiver.loginService = (LoginServiceImpl) context.getBean("loginService");
        loginServiceReceiver.loginService.checkLogin("admin", "admin");
    }
}
