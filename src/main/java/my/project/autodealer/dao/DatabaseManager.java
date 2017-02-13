package my.project.autodealer.dao;

import my.project.autodealer.model.Advert;
import my.project.autodealer.model.User;

import java.util.List;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface DatabaseManager {

    void addNewUser(User user);

    User getUser(String name);

    boolean isExistUser(String name, String password);

    List getAutoMakers();

    List getAutoModels();

    List getCarBody();

    List getTransmissions();

    List getConditions();

    List getFuelType();

    List getAdverts();

    void saveAdvert(Advert advert);

    long recieveAdvertsCount();

    List receiveAdvertsByPage(int first, int last);
}
