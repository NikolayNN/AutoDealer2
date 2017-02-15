package my.project.autodealer.model;

/**
 * Created by Nikol on 2/4/2017.
 */
public class Advert {
    private int id;
    private Car car;
    private User users;
    private Status status;
    private long createdDate;

    public Advert(Car car, User users, Status status, long createdDate) {
        this.car = car;
        this.users = users;
        this.status = status;
        this.createdDate = createdDate;
    }

    public Advert() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Advert that = (Advert) o;

        if (id != that.id) return false;
        if (createdDate != that.createdDate) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long result = id;
        result = 31 * result + createdDate;
        return (int) result;
    }
}
