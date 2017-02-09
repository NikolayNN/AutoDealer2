package my.project.autodealer.model;

/**
 * Created by Nikol on 2/8/2017.
 */
public class OwnerInfo {
    int mileage;
    String condition;
    String description;
    int price;

    public OwnerInfo(int mileage, String condition, String description, int price) {
        this.mileage = mileage;
        this.condition = condition;
        this.description = description;
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public String getCondition() {
        return condition;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
