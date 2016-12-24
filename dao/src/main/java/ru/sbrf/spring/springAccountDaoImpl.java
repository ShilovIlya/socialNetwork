package ru.sbrf.spring;

import ru.sbrf.Account;
import ru.sbrf.AccountDao;

public class springAccountDaoImpl implements AccountDao {
    @Override
    public Long create(Account account) {
        System.out.println("Create account with spring");
        return null;
    }

    @Override
    public Account getAccountById(long id) {
        System.out.println("Try to get account by Id with spring");
        return null;
    }
}
