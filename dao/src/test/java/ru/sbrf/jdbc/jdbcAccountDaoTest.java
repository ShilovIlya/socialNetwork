package ru.sbrf.jdbc;

import ru.sbrf.Account;

public class jdbcAccountDaoTest {

    String url = "jdbc:h2:~/test";
    String login = "sa";
    String password = "";

//    @Test
//    public void testCreate() throws Exception {
//
//        try (Connection connection = DriverManager.getConnection(url, login, password)) {
//            connection.setAutoCommit(false);
//            AccountDao accountDao = new jdbcAccountDao(connection);
//            Long id1 = accountDao.create(new Account("myLogin", "myPassword"));
//            Long id2 = accountDao.create(new Account("myLogin2", "myPassword2"));
//            Assert.assertTrue(id1.equals(id2 - 1));
//
//        }
//    }
//
//    @Test
//    public void testGetAccountById() throws Exception {
//
//        try (Connection connection = DriverManager.getConnection(url, login, password)) {
//            connection.setAutoCommit(false);
//            AccountDao accountDao = new jdbcAccountDao(connection);
//            Long id1 = accountDao.create(new Account("myLogin", "myPassword"));
//            Long id2 = accountDao.create(new Account("myLogin2", "myPassword2"));
//            Account newAcc = new Account("myLogin", "myPassword");
//            newAcc.setAccountId(1L);
//            Account account = accountDao.getAccountById(id1);
//            Assert.assertTrue(account.getLogin().equals(newAcc.getLogin()));
//        }
//    }
}