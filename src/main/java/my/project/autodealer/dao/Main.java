package my.project.autodealer.dao;

import org.hibernate.Session;

/**
 * Created by Nikol on 1/29/2017.
 */
public class Main {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        RefMakerRepository refMaker = session.get(RefMakerRepository.class, 1);
        RefModelRepository refModel = session.get(RefModelRepository.class, 1);
        RefCarbodyRepository refCarbody = session.get(RefCarbodyRepository.class, 2);
        RefTransmissionRepository refTransmission = session.get(RefTransmissionRepository.class, 1);
        RefFueltypeRepository refFueltype = session.get(RefFueltypeRepository.class, 1);

        session.beginTransaction();


        MakerinfoRepository makerInfo = new MakerinfoRepository();
        makerInfo.setMaker(refMaker);
        makerInfo.setModel(refModel);
        makerInfo.setCarBody(refCarbody);
        makerInfo.setTransmission(refTransmission);
        makerInfo.setFuelType(refFueltype);
        makerInfo.setCapacity((short) 77992);
        makerInfo.setYear((short) 2200);

        session.save(makerInfo);
        session.getTransaction().commit();

        session.close();

    }
}
