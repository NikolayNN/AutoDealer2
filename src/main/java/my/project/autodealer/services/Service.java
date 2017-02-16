package my.project.autodealer.services;
import my.project.autodealer.model.*;
import my.project.autodealer.model.characteristics.*;

import java.util.List;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface Service {

    void addNewUser(User user);

    User loadUser(String name);

    List<String> getAutoMakers();

    Maker loadMaker(String maker);

    List<String> getAutoModels();

    Model loadModel(String model);

    List<String> getCarBodies();

    CarBody loadCarBody(String body);

    List<String> getTransmissions();

    Transmission loadTransmission(String transmission);

    List<String> getFuelTypes();

    FuelType loadFuelType(String fuelType);

    List<String> getConditions();

    Condition loadCondition(String name);

    void saveAdvert(Advert advert);

    long receiveAdvertsCount();

    List getAdvertsByPage(int currentPage, int advertsOnPage);

    Status loadStatus(String status);

    List<Advert> getAdvertsByPageForUser(int currentPage, int adverts_on_page, User user);

    long receiveUserAdvertsCount(User user);
}
