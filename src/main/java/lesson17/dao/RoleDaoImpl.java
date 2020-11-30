package lesson17.dao;

import lesson17.entities.Role;
import lesson17.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RoleDaoImpl implements RoleDao {

    @Override
    public void save(Role role) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(role);
        transaction.commit();
        session.close();
    }
}
