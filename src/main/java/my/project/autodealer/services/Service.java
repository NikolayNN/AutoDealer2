package my.project.autodealer.services;
import my.project.autodealer.dao.repositories.*;

import java.util.List;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface Service {

    void addNewUser(UsersRepository user);

    UsersRepository loadUser(String name);

    boolean isExistUser(String name, String password);

    List<String> getAutoMakers();

    RefMakerRepository loadMaker(String maker);

    List<String> getAutoModels();

    RefModelRepository loadModel(String model);

    List<String> getCarBodies();

    RefCarbodyRepository loadCarbody(String body);

    List<String> getTransmissions();

    RefTransmissionRepository loadTransmission(String transmission);

    List<String> getFuelTypes();

    RefFueltypeRepository loadFuelType(String fuelType);

    List<String> getConditions();

    RefConditionRepository loadCondition(String name);

    void saveAdvert(Advert advert);

    List getAdverts();

    long recieveAdvertsCount();

    List getAdvertsByPage(int currentPage, int advertsOnPage);

    RefStatusRepository loadStatus(String status);

}
