package lesson17;

import lesson17.entities.Customer;
import lesson17.entities.Role;
import lesson17.services.CustomerService;
import lesson17.services.CustomerServiceImpl;
import lesson17.services.RoleService;
import lesson17.services.RoleServiceImpl;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("ALEX", "BOBOVICH", 100, "ALEX777@MAIL.COM", "QWERTY!@#$%");

        CustomerService service = new CustomerServiceImpl();
        RoleService roleService = new RoleServiceImpl();

        Role role = new Role();
        role.setName("FIRST");
        role.setDescription("some description");
        roleService.save(role);

        HashSet<Customer> customers = new HashSet<>();
        customers.add(customer);
        role.setCustomers(customers);

        HashSet<Role> roles = new HashSet<>();
        roles.add(role);
        customer.setRoles(roles);

        service.save(customer);



//        Customer customerById = service.getById(1);
//        System.out.println(customerById.toString());
    }
}
