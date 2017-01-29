package my.project.autodealer.dao;

import org.hibernate.Session;

/**
 * Created by Nikol on 1/29/2017.
 */
public class Main {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        RefFueltypeRepository carBody = new RefFueltypeRepository();
        carBody.setFuelType("4564");

        session.save(carBody);
        session.getTransaction().commit();

        session.close();

    }
}
