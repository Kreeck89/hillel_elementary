package lesson18.dao;

import lesson18.utils.HibernateUtil;
import lesson18.entities.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProjectDaoImpl implements ProjectDao {

    @Override
    public void save(Project project) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(project);
            transaction.commit();
        }
    }
}
