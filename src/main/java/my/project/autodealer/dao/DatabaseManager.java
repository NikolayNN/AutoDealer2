package my.project.autodealer.dao;

import my.project.autodealer.model.User;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface DatabaseManager {

    void addNewUser(User user);

    User getUser(String name);

    boolean isExistUser(String name, String password);
}
