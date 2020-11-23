package lesson15.services;

import lesson15.entities.Sub;
import lesson15.utils.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SubService {
    private static final String SAVE_QUERY = "INSERT INTO subs (name, description) VALUES (?,?)";

    public void save(Sub sub) {
        try(Connection connection = Database.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_QUERY)) {
            preparedStatement.setString(1, sub.getName());
            preparedStatement.setString(2, sub.getDescription());
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //init ALL CRUD QUERIES;
}
