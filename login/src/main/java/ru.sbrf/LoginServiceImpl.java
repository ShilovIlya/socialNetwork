package ru.sbrf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public Long checkLogin(String login, String password) {
        System.out.println("Check login in login service impl");

        return 1L;
    }
}
