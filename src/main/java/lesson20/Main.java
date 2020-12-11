package lesson20;

import lesson20.entities.Employee;
import lesson20.entities.HumanParameters;
import lesson20.services.EmployeeService;
import lesson20.services.EmployeeServiceImpl;

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
