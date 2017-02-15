package my.project.autodealer.services;

import my.project.autodealer.dao.DatabaseManager;
import my.project.autodealer.model.*;
import my.project.autodealer.model.characteristics.*;

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
    public User loadUser(String name) {
        return databaseManager.loadUser(name);
    }

    @Override
    public boolean isExistUser(String name, String password) {
        return databaseManager.isExistUser(name, password);
    }

    @Override
    public List<String> getAutoMakers(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadAutoMakers();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            Maker refMaker = (Maker) iter.next();
            result.add(refMaker.getMaker());
        }
        return result;
    }

    @Override
    public Maker loadMaker(String maker) {
        return databaseManager.loadMaker(maker);
    }

    @Override
    public List<String> getAutoModels(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadAutoModels();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            Model refModel = (Model) iter.next();
            result.add(refModel.getModel());
        }
        return result;
    }

    @Override
    public Model loadModel(String model) {
        return databaseManager.loadModel(model);
    }

    @Override
    public List<String> getCarBodies(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadCarBodies();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            CarBody refCarbody = (CarBody) iter.next();
            result.add(refCarbody.getCarBody());
        }
        return result;
    }

    @Override
    public CarBody loadCarbody(String body) {
        return databaseManager.loadCarbody(body);
    }

    @Override
    public List<String> getTransmissions(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadTransmissions();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            Transmission refTransmission = (Transmission) iter.next();
            result.add(refTransmission.getTransmission());
        }
        return result;
    }

    @Override
    public Transmission loadTransmission(String transmission) {
        return databaseManager.loadTransmission(transmission);
    }

    @Override
    public List<String> getFuelTypes(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadFuelType();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            FuelType refFueltype = (FuelType) iter.next();
            result.add(refFueltype.getFuelType());
        }
        return result;
    }

    @Override
    public FuelType loadFuelType(String fuelType) {
        return databaseManager.loadFuelType(fuelType);
    }

    @Override
    public List<String> getConditions(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadConditions();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            Condition condition = (Condition) iter.next();
            result.add(condition.getCondition());
        }
        return result;
    }

    @Override
    public Condition loadCondition(String name) {
        return databaseManager.loadCondition(name);
    }

    @Override
    public void saveAdvert(Advert advert) {
        databaseManager.saveAdvert(advert);
    }

    @Override
    public List getAdverts() {
        return databaseManager.loadAdverts();
    }

    @Override
    public long recieveAdvertsCount(){
        return databaseManager.recieveAdvertsCount();
    }

    @Override
    public List getAdvertsByPage(int currentPage, int advertsOnPage){
        int first = currentPage * advertsOnPage;
        return databaseManager.receiveAdvertsByPage(first, advertsOnPage);
    }

    @Override
    public Status loadStatus(String status) {
        return databaseManager.loadStatus(status);
    }


}
