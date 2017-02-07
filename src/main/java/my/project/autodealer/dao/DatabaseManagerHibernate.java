package my.project.autodealer.dao;

import my.project.autodealer.dao.repositories.RefMakerRepository;
import my.project.autodealer.dao.repositories.UsersRepository;
import my.project.autodealer.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

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

    @Override
    public User getUser(String name) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UsersRepository where name =:name ");
        query.setParameter("name", name);
        UsersRepository usersRepository = (UsersRepository) query.uniqueResult();
        if(usersRepository == null){
            throw new IllegalArgumentException("user with name " + name + " doesn't found");
        }
        return usersRepository.getUser();
    }

    @Override
    public boolean isExistUser(String name, String password) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from UsersRepository where name =:name and password =:password ");
        query.setParameter("name", name);
        query.setParameter("password", password);
        UsersRepository usersRepository = (UsersRepository) query.uniqueResult();
        if (usersRepository != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List getAutoMakers(){
        return getList("from RefMakerRepository");
    }

    @Override
    public List getAutoModels(){
        return getList("from RefModelRepository");
    }

    @Override
    public List getCarBody(){
        return getList("from RefCarbodyRepository");
    }

    @Override
    public List getTransmissions(){
        return getList("from RefTransmissionRepository");
    }

    @Override
    public List getConditions(){
        return getList("from RefConditionRepository");
    }

    @Override
    public List getFuelType(){
        return getList("from RefFueltypeRepository");
    }

    private List getList(String hql){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
        List result = query.list();
        session.close();
        return result;
    }

}
