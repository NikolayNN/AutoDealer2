package my.project.autodealer.dao.repositories;

/**
 * Created by Nikol on 2/4/2017.
 */
public class AdvertRepository {
    private int id;
    private CarRepository car;
    private UsersRepository users;
    private RefStatusRepository status;
    private long createdDate;

    public AdvertRepository(CarRepository car, UsersRepository users, RefStatusRepository status, long createdDate) {
        this.car = car;
        this.users = users;
        this.status = status;
        this.createdDate = createdDate;
    }

    public AdvertRepository() {
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

    public CarRepository getCar() {
        return car;
    }

    public void setCar(CarRepository car) {
        this.car = car;
    }

    public UsersRepository getUsers() {
        return users;
    }

    public void setUsers(UsersRepository users) {
        this.users = users;
    }

    public RefStatusRepository getStatus() {
        return status;
    }

    public void setStatus(RefStatusRepository status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdvertRepository that = (AdvertRepository) o;

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
