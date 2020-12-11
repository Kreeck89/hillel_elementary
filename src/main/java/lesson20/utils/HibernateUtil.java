package lesson20.utils;

import lesson20.entities.Boss;
import lesson20.entities.Branch;
import lesson20.entities.Employee;
import lesson20.entities.Project;
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
