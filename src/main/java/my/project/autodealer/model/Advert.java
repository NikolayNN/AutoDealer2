package my.project.autodealer.model;

/**
 * Created by Nikol on 2/8/2017.
 */
public class Advert {
    Car car;
    long createdDate;
    User user;
    String status;

    public Advert(Car car, long createdDate, User user, String status) {
        this.car = car;
        this.createdDate = createdDate;
        this.user = user;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Car getCar() {
        return car;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public User getUser() {
        return user;
    }

    public String getStatus() {
        return status;
    }
}
