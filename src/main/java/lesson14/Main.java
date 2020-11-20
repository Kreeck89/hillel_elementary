package lesson14;

import lesson14.entities.Customer;
import lesson14.services.CustomerService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        List<Customer> all = customerService.getAll();

        //        all.forEach(System.out::println);
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }

//        Customer customer = new Customer("Oleg", "Olegovich", 16, "oleg17@mail.com", "qwerty");
//        customerService.save(customer);

//        customerService.updateEmail(19, "new_email@mail.ua");

        customerService.delete(19);
    }
}
