package lesson17.utils;

import lesson17.entities.Customer;
import lesson17.entities.House;
import lesson17.entities.Passport;
import lesson17.entities.Role;
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
            configure.addAnnotatedClass(Customer.class);
            configure.addAnnotatedClass(House.class);
            configure.addAnnotatedClass(Role.class);
            configure.addAnnotatedClass(Passport.class);
            StandardServiceRegistryBuilder builder =
                    new StandardServiceRegistryBuilder().applySettings(configure.getProperties());
            sessionFactory = configure.buildSessionFactory(builder.build());
            return sessionFactory;
    }
}
