package my.project.autodealer.dao.repositories;

/**
 * Created by Nikol on 1/29/2017.
 */
public class MakerInfoRepository {
    private int id;
    private RefMakerRepository refMaker;
    private RefModelRepository refModel;
    private RefCarbodyRepository refCarBody;
    private RefTransmissionRepository refTransmission;
    private RefFueltypeRepository refFuelType;
    private short capacity;
    private short year;

    public int getId() {
        return id;
    }

    public MakerInfoRepository() {
    }

    public MakerInfoRepository(RefMakerRepository refMaker, RefModelRepository refModel, RefCarbodyRepository refCarBody, RefTransmissionRepository refTransmission, RefFueltypeRepository refFuelType, short capacity, short year) {
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

    public RefMakerRepository getRefMaker() {
        return refMaker;
    }

    public void setRefMaker(RefMakerRepository maker) {
        this.refMaker = maker;
    }

    public RefModelRepository getRefModel() {
        return refModel;
    }

    public void setRefModel(RefModelRepository model) {
        this.refModel = model;
    }

    public RefCarbodyRepository getRefCarBody() {
        return refCarBody;
    }

    public void setRefCarBody(RefCarbodyRepository carBody) {
        this.refCarBody = carBody;
    }

    public RefTransmissionRepository getRefTransmission() {
        return refTransmission;
    }

    public void setRefTransmission(RefTransmissionRepository transmission) {
        this.refTransmission = transmission;
    }

    public RefFueltypeRepository getRefFuelType() {
        return refFuelType;
    }

    public void setRefFuelType(RefFueltypeRepository fuelType) {
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
