package lesson20.services;

import lesson20.dao.EmployeeDao;
import lesson20.dao.EmployeeDaoImpl;
import lesson20.entities.Employee;
import lesson20.utils.LoggerUtil;
import org.apache.log4j.Logger;

import java.util.logging.Level;

public class EmployeeServiceImpl implements EmployeeService {
    Logger logger = Logger.getLogger(EmployeeServiceImpl.class);
//    Logger logger = LoggerUtil.getLogger(EmployeeServiceImpl.class);

    @Override
    public void save(Employee employee) {
//        logger.log(Level.INFO, employee.toString());
        logger.debug(employee.toString());
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.save(employee);
    }
}
