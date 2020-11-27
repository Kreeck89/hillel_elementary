package lesson16.services;

import lesson16.dao.CustomerDao;
import lesson16.dao.CustomerDaoImpl;
import lesson16.entities.Customer;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void save(Customer customer) {
        //logic....
        if (customer == null) {
            System.out.println("customer is empty");
            return;
        }

        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.save(customer);
    }

    @Override
    public void update(Customer customer) {
        if (customer == null) {
            System.out.println("customer is empty");
            return;
        }

        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.update(customer);
    }

    @Override
    public Customer getById(int id) {
        CustomerDao customerDao = new CustomerDaoImpl();
        return customerDao.getById(id);
    }
}
