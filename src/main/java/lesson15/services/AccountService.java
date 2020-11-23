package lesson15.services;

import lesson15.entities.Account;
import lesson15.utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static final String GET_ACCOUNTS_WITHOUT_SUBS = "SELECT * FROM accounts WHERE subs_id = 0 OR subs_id IS NULL";
    private static final String SAVE_QUERY = "INSERT INTO accounts (email, password, subs_id) VALUES (?,?,?)";

    public void save(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE_QUERY)) {
            preparedStatement.setString(1, account.getEmail());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setInt(3, account.getSubsId());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //init ALL CRUD QUERIES;

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
