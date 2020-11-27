package lesson16;

import lesson16.entities.Customer;
import lesson16.services.CustomerService;
import lesson16.services.CustomerServiceImpl;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("AaAaAaA", "BOBOVICH", 100, "ALEX_BOB17@MAIL.COM", "QWERTY!@#$%");
        CustomerService service = new CustomerServiceImpl();
//        service.save(customer);

//        customer.setId(17);
//        service.update(customer);
        //
        Customer customerById = service.getById(17);
        System.out.println(customerById.toString());
    }
}
