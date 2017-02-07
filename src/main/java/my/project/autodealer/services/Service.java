package my.project.autodealer.services;

import my.project.autodealer.model.User;

/**
 * Created by Nikol on 2/5/2017.
 */
public interface Service {

    void addNewUser(User user);
    User receiveUser(String name);

    boolean isExistUser(String name, String password);
}
