package my.project.autodealer.dao;

import my.project.autodealer.dao.repositories.UsersRepository;
import my.project.autodealer.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nikol on 2/7/2017.
 */
public class DatabaseManagerHibernateTest {
    private static SessionFactory sessionFactory;
    private DatabaseManager databaseManager;
    private User testUser;

    static {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Before
    public void setup() {
        testUser = new User("testName", "testPassword", "test234@mail.ru");
        addTestRecordToDatabase();
        databaseManager = new DatabaseManagerHibernate();
    }

    private void addTestRecordToDatabase() {
        Session session = sessionFactory.openSession();
        UsersRepository usersRepository = new UsersRepository();
        usersRepository.createUser(testUser);
        session.beginTransaction();
        session.save(usersRepository);
        session.getTransaction().commit();
        session.close();
    }


    @After
    public void destroy() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UsersRepository where name =:name ");
        query.setParameter("name", testUser.getName());
        UsersRepository usersRepository = (UsersRepository) query.uniqueResult();
        session.beginTransaction();
        session.delete(usersRepository);
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void addNewUser() throws Exception {

    }

    @Test(expected = IllegalArgumentException.class)
    public void getUnknownUser() throws Exception {
        databaseManager.getUser("unknownUser");
    }

    @Test
    public void getUser() throws Exception {
        User actualUser = databaseManager.getUser(testUser.getName());
        assertEquals(actualUser.getName(), testUser.getName());
        assertEquals(actualUser.getPassword(), testUser.getPassword());
        assertEquals(actualUser.getEmail(), testUser.getEmail());
    }

    @Test
    public void isExistUser() throws Exception {
        assertTrue(databaseManager.isExistUser(testUser.getName(), testUser.getPassword()));
    }

}