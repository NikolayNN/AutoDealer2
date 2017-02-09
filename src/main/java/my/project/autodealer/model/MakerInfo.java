package my.project.autodealer.model;

/**
 * Created by Nikol on 2/8/2017.
 */
public class MakerInfo {
    String maker;
    String model;
    String carBody;
    String transmission;
    String fuelType;
    int capacity;
    int year;

    public MakerInfo(String maker, String model, String carBody, String transmission, String fuelType, int capacity, int year) {
        this.maker = maker;
        this.model = model;
        this.carBody = carBody;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.year = year;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getYear() {
        return year;
    }
}
