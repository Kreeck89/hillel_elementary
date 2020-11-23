package lesson15.services;

import lesson15.entities.Account;
import lesson15.utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccountService {
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
}
