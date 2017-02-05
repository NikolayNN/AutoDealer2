package my.project.autodealer.dao.repositories;

/**
 * Created by Nikol on 2/4/2017.
 */
public class AdvertRepository {
    private int id;
    private int createdDate;
    private CarRepository car;
    private UsersRepository users;
    private RefStatusRepository status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(int createdDate) {
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
        int result = id;
        result = 31 * result + createdDate;
        return result;
    }
}
