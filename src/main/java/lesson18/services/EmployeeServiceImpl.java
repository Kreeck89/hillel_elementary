package lesson18.services;

import lesson18.dao.EmployeeDao;
import lesson18.dao.EmployeeDaoImpl;
import lesson18.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void save(Employee employee) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.save(employee);
    }
}
