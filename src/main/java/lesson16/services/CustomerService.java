package lesson16.services;

import lesson16.entities.Customer;

public interface CustomerService {

    void save(Customer customer);

    void update(Customer customer);

    Customer getById(int id);
}
