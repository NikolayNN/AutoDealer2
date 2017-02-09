package my.project.autodealer.services;

import my.project.autodealer.model.Advert;
import my.project.autodealer.model.User;

import java.util.List;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface Service {

    void addNewUser(User user);
    User receiveUser(String name);

    boolean isExistUser(String name, String password);

    List<String> getAutoMakers();

    List<String> getAutoModels();

    List<String> getCarBodies();

    List<String> getTransmissions();

    List<String> getFuelTypes();

    List<String> getConditions();

    void saveAdvert(Advert advert);
}
