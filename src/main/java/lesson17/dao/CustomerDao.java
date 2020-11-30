package lesson17.dao;

import lesson17.entities.Customer;

public interface CustomerDao {

    void save(Customer customer);

    void update(Customer customer);

    Customer getById(int id);
}
