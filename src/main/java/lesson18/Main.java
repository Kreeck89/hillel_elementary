package lesson18;

import lesson18.entities.Employee;
import lesson18.entities.HumanParameters;
import lesson18.services.EmployeeService;
import lesson18.services.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        HumanParameters humanParameters = new HumanParameters();
        humanParameters.setName("Aleksandr");
        humanParameters.setSurname("Bobov");
        humanParameters.setPhone("380990009988");
        employee.setParameters(humanParameters);

        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.save(employee);
    }
}
