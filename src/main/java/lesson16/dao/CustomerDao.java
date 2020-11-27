package lesson16.dao;

import lesson16.entities.Customer;

public interface CustomerDao {

    void save(Customer customer);

    void update(Customer customer);

    Customer getById(int id);
}
