package my.project.autodealer.dao;

import my.project.autodealer.model.*;
import my.project.autodealer.model.characteristics.*;

import java.util.List;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface DatabaseManager {

    void addNewUser(User user);

    User loadUser(String name);

    boolean isExistUser(String name, String password);

    List loadAutoMakers();

    List loadAutoModels();

    List loadCarBodies();

    List loadTransmissions();

    List loadConditions();

    Maker loadMaker(String maker);

    Model loadModel(String model);

    CarBody loadCarbody(String body);

    Transmission loadTransmission(String transmission);

    FuelType loadFuelType(String fuelType);

    Condition loadCondition(String name);

    List loadFuelType();

    List loadAdverts();

    void saveAdvert(Advert advert);

    long receiveAdvertsCount();

    List receiveAdvertsByPage(int first, int last);

    Status loadStatus(String status);
}
