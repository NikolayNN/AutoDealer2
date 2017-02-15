package my.project.autodealer.model;

import my.project.autodealer.model.characteristics.*;

/**
 * Created by Nikol on 1/29/2017.
 */
public class MakerInfo {
    private int id;
    private Maker refMaker;
    private Model refModel;
    private Carbody refCarBody;
    private Transmission refTransmission;
    private FuelType refFuelType;
    private short capacity;
    private short year;

    public int getId() {
        return id;
    }

    public MakerInfo() {
    }

    public MakerInfo(Maker refMaker, Model refModel, Carbody refCarBody, Transmission refTransmission, FuelType refFuelType, short capacity, short year) {
        this.refMaker = refMaker;
        this.refModel = refModel;
        this.refCarBody = refCarBody;
        this.refTransmission = refTransmission;
        this.refFuelType = refFuelType;
        this.capacity = capacity;
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Maker getRefMaker() {
        return refMaker;
    }

    public void setRefMaker(Maker maker) {
        this.refMaker = maker;
    }

    public Model getRefModel() {
        return refModel;
    }

    public void setRefModel(Model model) {
        this.refModel = model;
    }

    public Carbody getRefCarBody() {
        return refCarBody;
    }

    public void setRefCarBody(Carbody carBody) {
        this.refCarBody = carBody;
    }

    public Transmission getRefTransmission() {
        return refTransmission;
    }

    public void setRefTransmission(Transmission transmission) {
        this.refTransmission = transmission;
    }

    public FuelType getRefFuelType() {
        return refFuelType;
    }

    public void setRefFuelType(FuelType fuelType) {
        this.refFuelType = fuelType;
    }

    public short getCapacity() {
        return capacity;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }
}
