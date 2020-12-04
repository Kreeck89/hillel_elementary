package lesson18.utils;

import lesson17.entities.Customer;
import lesson17.entities.House;
import lesson17.entities.Passport;
import lesson17.entities.Role;
import lesson18.entities.Boss;
import lesson18.entities.Branch;
import lesson18.entities.Employee;
import lesson18.entities.Project;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory != null) {
            return sessionFactory;
        }
            Configuration configure = new Configuration().configure();
            configure.addAnnotatedClass(Employee.class);
            configure.addAnnotatedClass(Project.class);
            configure.addAnnotatedClass(Boss.class);
            configure.addAnnotatedClass(Branch.class);
            StandardServiceRegistryBuilder builder =
                    new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
            sessionFactory = configure.buildSessionFactory(builder.build());
            return sessionFactory;
    }
}
