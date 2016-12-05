package ru.sbrf.jdbc;

import ru.sbrf.Account;
import ru.sbrf.AccountDao;

import java.sql.*;

public class jdbcAccountDao implements AccountDao {
    private final Connection connection;

    public jdbcAccountDao(Connection connection) {
        this.connection = connection;
    }

    public Long create(Account account) {
        String sql = "INSERT INTO ACCOUNTS(id, login, password) VALUES(ACC_SEQ.NEXTVAL, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, account.getLogin());
            statement.setString(2, account.getPassword());

            if (statement.executeUpdate() == 1) {
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        Long id = generatedKeys.getLong(1);
                        account.setAccountId(id);

                        return id;
                    } else {
                        throw new RuntimeException("Unable to get user id");
                    }
                }
            } else {
                throw new RuntimeException("Account not created");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account getAccountById(long id) {
        String sql = "SELECT login, password FROM ACCOUNTS WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Account account = new Account(resultSet.getString("login"), resultSet.getString("password"));
                return account;
            } else {
                throw new RuntimeException("Account with id = " + id + " not found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
