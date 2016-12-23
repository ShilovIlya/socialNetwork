package ru.sbrf;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class SystemManager {

    public static void main(String[] args) {
        LoginServiceReceiver loginServiceReceiver = new LoginServiceReceiver("FirstQueue");
        DAOReceiver daoReceiver = new DAOReceiver("FirstQueue");
        Sender sender = new Sender("FirstQueue");
        try {
            loginServiceReceiver.receive();
            daoReceiver.receive();
            for (int i = 0; i < 10; i++) {
                sender.sendHelloWorld("message - " + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
