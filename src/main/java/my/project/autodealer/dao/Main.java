package my.project.autodealer.dao;

import org.hibernate.Session;

/**
 * Created by Nikol on 1/29/2017.
 */
public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        MakerinfoRepository makerinfo = session.load(MakerinfoRepository.class, 1);
        OwnerinfoRepository ownerInfo = session.load(OwnerinfoRepository.class, 1);

        session.beginTransaction();

        CarRepository car = new CarRepository();

        car.setMakerinfo(makerinfo);
        car.setOwnerinfo(ownerInfo);

        session.save(car);
        session.getTransaction().commit();

        session.close();

    }
}
