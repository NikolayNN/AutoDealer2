package my.project.autodealer.services;

import my.project.autodealer.dao.DatabaseManager;
import my.project.autodealer.dao.repositories.*;
import my.project.autodealer.model.Advert;
import my.project.autodealer.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    @Override
    public User receiveUser(String name) {
        return databaseManager.getUser(name);
    }

    @Override
    public boolean isExistUser(String name, String password) {
        return databaseManager.isExistUser(name, password);
    }

    @Override
    public List<String> getAutoMakers(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.getAutoMakers();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefMakerRepository refMaker = (RefMakerRepository) iter.next();
            result.add(refMaker.getManufactor());
        }
        return result;
    }

    @Override
    public List<String> getAutoModels(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.getAutoModels();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefModelRepository refModel = (RefModelRepository) iter.next();
            result.add(refModel.getModel());
        }
        return result;
    }

    @Override
    public List<String> getCarBodies(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.getCarBody();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefCarbodyRepository refCarbody = (RefCarbodyRepository) iter.next();
            result.add(refCarbody.getCarBody());
        }
        return result;
    }

    @Override
    public List<String> getTransmissions(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.getTransmissions();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefTransmissionRepository refTransmission = (RefTransmissionRepository) iter.next();
            result.add(refTransmission.getTransmission());
        }
        return result;
    }

    @Override
    public List<String> getFuelTypes(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.getFuelType();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefFueltypeRepository refFueltype = (RefFueltypeRepository) iter.next();
            result.add(refFueltype.getFuelType());
        }
        return result;
    }

    @Override
    public List<String> getConditions(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.getConditions();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefConditionRepository condition = (RefConditionRepository) iter.next();
            result.add(condition.getCondition());
        }
        return result;
    }

    @Override
    public void saveAdvert(Advert advert) {
        //todo
    }

}
