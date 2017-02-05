package my.project.autodealer.dao;

import my.project.autodealer.dao.repositories.UsersRepository;
import my.project.autodealer.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Nikol on 2/5/2017.
 */
public class DatabaseManagerHibernate implements DatabaseManager {
    private SessionFactory sessionFactory;

    {
        sessionFactory = HibernateUtil.getSessionFactory();
    }


    @Override
    public void addNewUser(User user) {
        Session session = sessionFactory.openSession();
        UsersRepository usersRepository = new UsersRepository();
        usersRepository.createUser(user);
        session.beginTransaction();
        session.save(usersRepository);
        session.getTransaction().commit();
    }
}
