package lesson17.services;

import lesson17.dao.CustomerDao;
import lesson17.dao.CustomerDaoImpl;
import lesson17.entities.Customer;

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
