package ru.sbrf;

import ru.sbrf.Account;

public interface AccountDao {

    Long create(Account account);

    Account getAccountById(long id);
}
