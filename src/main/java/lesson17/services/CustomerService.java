package lesson17.services;

import lesson17.entities.Customer;

public interface CustomerService {

    void save(Customer customer);

    void update(Customer customer);

    Customer getById(int id);
}
