package my.project.autodealer.dao;

import my.project.autodealer.dao.repositories.*;

import java.util.List;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface DatabaseManager {

    void addNewUser(UsersRepository user);

    UsersRepository loadUser(String name);

    boolean isExistUser(String name, String password);

    List loadAutoMakers();

    List loadAutoModels();

    List loadCarBodies();

    List loadTransmissions();

    List loadConditions();

    RefMakerRepository loadMaker(String maker);

    RefModelRepository loadModel(String model);

    RefCarbodyRepository loadCarbody(String body);

    RefTransmissionRepository loadTransmission(String transmission);

    RefFueltypeRepository loadFuelType(String fuelType);

    RefConditionRepository loadCondition(String name);

    List loadFuelType();

    List loadAdverts();

    void saveAdvert(Advert advert);

    long recieveAdvertsCount();

    List receiveAdvertsByPage(int first, int last);

    RefStatusRepository loadStatus(String status);
}
