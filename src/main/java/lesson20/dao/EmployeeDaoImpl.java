package lesson20.dao;

import lesson20.utils.HibernateUtil;
import lesson20.entities.Employee;
import lesson20.utils.LoggerUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.logging.Level;

public class EmployeeDaoImpl implements EmployeeDao {
    Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
//    Logger logger = LoggerUtil.getLogger(EmployeeDaoImpl.class);

    @Override
    public void save(Employee employee) {
//        logger.log(Level.INFO, employee.toString());
        logger.debug(employee.toString());

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            logger.error("Error connection to DB!", e);
        }
    }
}
