package my.project.autodealer.model;

import my.project.autodealer.model.characteristics.*;

import javax.persistence.*;

/**
 * Created by Nikol on 1/29/2017.
 */
@Entity
@Table(name="makerinfo")
public class MakerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "maker_id")
    private Maker refMaker;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id")
    private Model refModel;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "car_body_id")
    private CarBody refCarBody;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "transmission_id")
    private Transmission refTransmission;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "fuel_type_id")
    private FuelType refFuelType;

    @Column(name = "capacity")
    private short capacity;

    @Column(name = "year")
    private short year;

    public int getId() {
        return id;
    }

    public MakerInfo() {
    }

    public MakerInfo(Maker refMaker, Model refModel, CarBody refCarBody, Transmission refTransmission, FuelType refFuelType, short capacity, short year) {
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

    public CarBody getRefCarBody() {
        return refCarBody;
    }

    public void setRefCarBody(CarBody carBody) {
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
