package my.project.autodealer.services;
import my.project.autodealer.dao.repositories.*;

import java.util.List;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface Service {

    void addNewUser(User user);

    User loadUser(String name);

    boolean isExistUser(String name, String password);

    List<String> getAutoMakers();

    Maker loadMaker(String maker);

    List<String> getAutoModels();

    Model loadModel(String model);

    List<String> getCarBodies();

    Carbody loadCarbody(String body);

    List<String> getTransmissions();

    Transmission loadTransmission(String transmission);

    List<String> getFuelTypes();

    FuelType loadFuelType(String fuelType);

    List<String> getConditions();

    Condition loadCondition(String name);

    void saveAdvert(Advert advert);

    List getAdverts();

    long recieveAdvertsCount();

    List getAdvertsByPage(int currentPage, int advertsOnPage);

    Status loadStatus(String status);

}
