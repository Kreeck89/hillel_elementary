package lesson15.services;

import lesson15.entities.Account;
import lesson15.utils.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static final String GET_ACCOUNTS_WITHOUT_SUBS = "SELECT * FROM accounts WHERE subs_id = 0 OR subs_id IS NULL";

    public List<Account> getAccountsWithoutSubs() {
        ArrayList<Account> accounts = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(GET_ACCOUNTS_WITHOUT_SUBS)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Account account = new Account(resultSet.getString("email"),
                        resultSet.getString("password"));
                accounts.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
}
