package my.project.autodealer.dao;

import org.hibernate.Session;

/**
 * Created by Nikol on 1/29/2017.
 */
public class Main {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        MakerinfoRepository makerInfo = new MakerinfoRepository();
        makerInfo.setMaker(new RefMakerRepository("TestMaker"));
        makerInfo.setModel(new RefModelRepository("TestModel"));
        makerInfo.setCarBody(new RefCarbodyRepository("CarBody"));
        makerInfo.setTransmission(new RefTransmissionRepository("testTransmission"));
        makerInfo.setFuelType(new RefFueltypeRepository("testFuel"));
        makerInfo.setCapacity((short) 1);
        makerInfo.setYear((short) 1);

        session.save(makerInfo);
        session.getTransaction().commit();

        session.close();

    }
}
