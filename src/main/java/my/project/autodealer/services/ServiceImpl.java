package my.project.autodealer.services;

import my.project.autodealer.dao.DatabaseManager;
import my.project.autodealer.model.User;

/**
 * Created by Nikol on 2/5/2017.
 */
public class ServiceImpl implements Service {
    DatabaseManager databaseManager;

    public ServiceImpl(DatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    @Override
    public void addNewUser(User user) {
        databaseManager.addNewUser(user);
    }
}
