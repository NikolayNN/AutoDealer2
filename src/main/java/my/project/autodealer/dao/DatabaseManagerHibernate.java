package my.project.autodealer.dao;

import my.project.autodealer.dao.repositories.*;
import my.project.autodealer.model.*;
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
        if (usersRepository == null) {
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
    public List getAutoMakers() {
        return getList("from RefMakerRepository");
    }

    @Override
    public List getAutoModels() {
        return getList("from RefModelRepository");
    }

    @Override
    public List getCarBody() {
        return getList("from RefCarbodyRepository");
    }

    @Override
    public List getTransmissions() {
        return getList("from RefTransmissionRepository");
    }

    @Override
    public List getConditions() {
        return getList("from RefConditionRepository");
    }

    @Override
    public List getFuelType() {
        return getList("from RefFueltypeRepository");
    }

    @Override
    public List getAdverts(){
        return  getList("from AdvertRepository");
    }

    @Override
    public void saveAdvert(Advert advert) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        AdvertRepository advertRepository = createAdvertRepository(advert);
        session.save(advertRepository);
        session.getTransaction().commit();
        session.close();
    }

    private AdvertRepository createAdvertRepository(Advert advert){
        return new AdvertRepository(
                createCarRepository(advert.getCar()),
                loadUserRepository(advert.getUser().getName()),
                loadRefStatusRepository(advert.getStatus()),
                advert.getCreatedDate()
        );
    }

    private CarRepository createCarRepository(Car car) {
        MakerInfoRepository makerInfoRepository = createMakerInfoRepository(car.getMakerInfo());
        OwnerInfoRepository ownerInfoRepository = createOwnerInfoRepository(car.getOwnerInfo());
        CarRepository carRepository = new CarRepository(makerInfoRepository, ownerInfoRepository);
        return carRepository;
    }

    private MakerInfoRepository createMakerInfoRepository(MakerInfo makerInfo) {
        return new MakerInfoRepository(
                loadRefMakerRepository(makerInfo.getMaker()),
                loadRefModelRepository(makerInfo.getModel()),
                loadRefCarbodyRepository(makerInfo.getCarBody()),
                loadRefTransmissionRepository(makerInfo.getTransmission()),
                loadRefFueltypeRepository(makerInfo.getFuelType()),
                (short) makerInfo.getCapacity(),
                (short) makerInfo.getYear()
        );
    }

    private OwnerInfoRepository createOwnerInfoRepository(OwnerInfo ownerInfo) {
        return new OwnerInfoRepository(
                ownerInfo.getMileage(),
                ownerInfo.getDescription(),
                ownerInfo.getPrice(),
                loadRefConditionRepository(ownerInfo.getCondition())
        );
    }


    private RefMakerRepository loadRefMakerRepository(String maker) {
        return (RefMakerRepository) getUniqueValue(String.format("from RefMakerRepository where manufactor='%s'", maker));
    }

    private RefModelRepository loadRefModelRepository(String model) {
        return (RefModelRepository) getUniqueValue(String.format("from RefModelRepository where model='%s'", model));
    }

    private RefCarbodyRepository loadRefCarbodyRepository(String body) {
        return (RefCarbodyRepository) getUniqueValue(String.format("from RefCarbodyRepository where car_body='%s'", body));
    }

    private RefTransmissionRepository loadRefTransmissionRepository(String transmission) {
        return (RefTransmissionRepository) getUniqueValue(String.format("from RefTransmissionRepository where transmission='%s'", transmission));
    }

    private RefFueltypeRepository loadRefFueltypeRepository(String fuelType) {
        return (RefFueltypeRepository) getUniqueValue(String.format("from RefFueltypeRepository where fuel_type='%s'", fuelType));
    }

    private RefConditionRepository loadRefConditionRepository(String condition) {
        return (RefConditionRepository) getUniqueValue(String.format("from RefConditionRepository where condition='%s'", condition));
    }

    private RefStatusRepository loadRefStatusRepository(String status) {
        return (RefStatusRepository) getUniqueValue(String.format("from RefStatusRepository where status='%s'", status));
    }

    private UsersRepository loadUserRepository(String name){
        return (UsersRepository) getUniqueValue(String.format("from UsersRepository where name='%s'", name));
    }

    public Object getUniqueValue(String hql) {
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
