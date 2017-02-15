package my.project.autodealer.model;

/**
 * Created by Nikol on 1/30/2017.
 */
public class OwnerInfo {
    private int id;
    private int mileage;
    private String description;
    private double price;
    private Condition refCondition;

    public OwnerInfo() {
    }

    public OwnerInfo(int mileage, String description, double price, Condition refCondition) {
        this.mileage = mileage;
        this.description = description;
        this.price = price;
        this.refCondition = refCondition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Condition getRefCondition() {
        return refCondition;
    }

    public void setRefCondition(Condition condition) {
        this.refCondition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OwnerInfo that = (OwnerInfo) o;

        if (id != that.id) return false;
        if (mileage != that.mileage) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + mileage;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
