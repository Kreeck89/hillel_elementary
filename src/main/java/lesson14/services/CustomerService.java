package lesson14.services;

import lesson14.entities.Customer;
import lesson14.utils.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static final String GET_ALL = "SELECT * FROM customers";
    private static final String SAVE = "INSERT INTO customers (name, surname, age, email, password) VALUES (?,?,?,?,?)";
    private static final String UPDATE_EMAIL = "UPDATE customers SET email = ? where id = ?";
    private static final String DELETE = "DELETE FROM customers WHERE id = ?";

    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            connection.setAutoCommit(false);
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setEmail(resultSet.getString("email"));
                customer.setName(resultSet.getString("name"));
                customer.setAge(resultSet.getInt("age"));
                customers.add(customer);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public void save(Customer customer) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SAVE)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getSurname());
            preparedStatement.setInt(3, customer.getAge());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getPassword());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmail(int id, String newEmail) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMAIL)) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, newEmail);
            preparedStatement.setInt(2, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
