package my.project.autodealer.dao.repositories;

/**
 * Created by Nikol on 1/29/2017.
 */
public class MakerinfoRepository {
    private int id;
    private RefMakerRepository maker;
    private RefModelRepository model;
    private RefCarbodyRepository carBody;
    private RefTransmissionRepository transmission;
    private RefFueltypeRepository fuelType;
    private short capacity;
    private short year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RefMakerRepository getMaker() {
        return maker;
    }

    public void setMaker(RefMakerRepository maker) {
        this.maker = maker;
    }

    public RefModelRepository getModel() {
        return model;
    }

    public void setModel(RefModelRepository model) {
        this.model = model;
    }

    public RefCarbodyRepository getCarBody() {
        return carBody;
    }

    public void setCarBody(RefCarbodyRepository carBody) {
        this.carBody = carBody;
    }

    public RefTransmissionRepository getTransmission() {
        return transmission;
    }

    public void setTransmission(RefTransmissionRepository transmission) {
        this.transmission = transmission;
    }

    public RefFueltypeRepository getFuelType() {
        return fuelType;
    }

    public void setFuelType(RefFueltypeRepository fuelType) {
        this.fuelType = fuelType;
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
