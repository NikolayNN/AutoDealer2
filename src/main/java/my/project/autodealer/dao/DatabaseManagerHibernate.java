package my.project.autodealer.dao;

import my.project.autodealer.dao.repositories.*;
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
    public void addNewUser(UsersRepository user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    @Override
    public UsersRepository loadUser(String name) {

        return loadUserRepository(name);
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
    public List loadAutoMakers() {
        return getList("from RefMakerRepository");
    }

    @Override
    public List loadAutoModels() {
        return getList("from RefModelRepository");
    }

    @Override
    public List loadCarBodies() {
        return getList("from RefCarbodyRepository");
    }

    @Override
    public List loadTransmissions() {
        return getList("from RefTransmissionRepository");
    }

    @Override
    public List loadConditions() {
        return getList("from RefConditionRepository");
    }

    @Override
    public List loadFuelType() {
        return getList("from RefFueltypeRepository");
    }

    @Override
    public List loadAdverts(){
        return  getList("from Advert");
    }

    @Override
    public void saveAdvert(Advert advert) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(advert);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public long recieveAdvertsCount(){
         return (Long) getUniqueValue("select count(*) from Advert");
    }

    @Override
    public List receiveAdvertsByPage(int first, int last){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("From Advert");
        query.setFirstResult(first);
        query.setMaxResults(last);
        return query.list();
    }

    @Override
    public RefMakerRepository loadMaker(String maker) {
        return (RefMakerRepository) getUniqueValue(String.format("from RefMakerRepository where maker='%s'", maker));
    }

    @Override
    public RefModelRepository loadModel(String model) {
        return (RefModelRepository) getUniqueValue(String.format("from RefModelRepository where model='%s'", model));
    }

    @Override
    public RefCarbodyRepository loadCarbody(String body) {
        return (RefCarbodyRepository) getUniqueValue(String.format("from RefCarbodyRepository where car_body='%s'", body));
    }

    @Override
    public RefTransmissionRepository loadTransmission(String transmission) {
        return (RefTransmissionRepository) getUniqueValue(String.format("from RefTransmissionRepository where transmission='%s'", transmission));
    }

    @Override
    public RefFueltypeRepository loadFuelType(String fuelType) {
        return (RefFueltypeRepository) getUniqueValue(String.format("from RefFueltypeRepository where fuel_type='%s'", fuelType));
    }

    @Override
    public RefConditionRepository loadCondition(String condition) {
        return (RefConditionRepository) getUniqueValue(String.format("from RefConditionRepository where condition='%s'", condition));
    }

    @Override
    public RefStatusRepository loadStatus(String status) {
        return (RefStatusRepository) getUniqueValue(String.format("from RefStatusRepository where status='%s'", status));
    }

    private UsersRepository loadUserRepository(String name){
        return (UsersRepository) getUniqueValue(String.format("from UsersRepository where name='%s'", name));
    }

    private Object getUniqueValue(String hql) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
        Object object = query.uniqueResult();
        session.close();
        return object;
    }

    private List getList(String hql) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
        List result = query.list();
        session.close();
        return result;
    }
}
