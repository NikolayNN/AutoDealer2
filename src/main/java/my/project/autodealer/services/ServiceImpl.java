package my.project.autodealer.services;

import my.project.autodealer.dao.DatabaseManager;
import my.project.autodealer.dao.repositories.*;

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
    public void addNewUser(UsersRepository user) {
        databaseManager.addNewUser(user);
    }

    @Override
    public UsersRepository loadUser(String name) {
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
            RefMakerRepository refMaker = (RefMakerRepository) iter.next();
            result.add(refMaker.getMaker());
        }
        return result;
    }

    @Override
    public RefMakerRepository loadMaker(String maker) {
        return databaseManager.loadMaker(maker);
    }

    @Override
    public List<String> getAutoModels(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadAutoModels();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefModelRepository refModel = (RefModelRepository) iter.next();
            result.add(refModel.getModel());
        }
        return result;
    }

    @Override
    public RefModelRepository loadModel(String model) {
        return databaseManager.loadModel(model);
    }

    @Override
    public List<String> getCarBodies(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadCarBodies();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefCarbodyRepository refCarbody = (RefCarbodyRepository) iter.next();
            result.add(refCarbody.getCarBody());
        }
        return result;
    }

    @Override
    public RefCarbodyRepository loadCarbody(String body) {
        return databaseManager.loadCarbody(body);
    }

    @Override
    public List<String> getTransmissions(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadTransmissions();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefTransmissionRepository refTransmission = (RefTransmissionRepository) iter.next();
            result.add(refTransmission.getTransmission());
        }
        return result;
    }

    @Override
    public RefTransmissionRepository loadTransmission(String transmission) {
        return databaseManager.loadTransmission(transmission);
    }

    @Override
    public List<String> getFuelTypes(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadFuelType();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefFueltypeRepository refFueltype = (RefFueltypeRepository) iter.next();
            result.add(refFueltype.getFuelType());
        }
        return result;
    }

    @Override
    public RefFueltypeRepository loadFuelType(String fuelType) {
        return databaseManager.loadFuelType(fuelType);
    }

    @Override
    public List<String> getConditions(){
        List<String> result = new ArrayList<>();
        List list = databaseManager.loadConditions();
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            RefConditionRepository condition = (RefConditionRepository) iter.next();
            result.add(condition.getCondition());
        }
        return result;
    }

    @Override
    public RefConditionRepository loadCondition(String name) {
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
    public RefStatusRepository loadStatus(String status) {
        return databaseManager.loadStatus(status);
    }


}
