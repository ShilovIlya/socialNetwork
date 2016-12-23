package ru.sbrf;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.*;


public class DAOReceiver {

    private final String QUEUE_NAME;

    public DAOReceiver(String queueName) {
        QUEUE_NAME = queueName;
    }

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
                                       byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received by daoService '" + message + "'");
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
