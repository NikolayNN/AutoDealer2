package my.project.autodealer.dao;

/**
 * Created by Nikol on 1/29/2017.
 */
public class RefStatusRepository {
    private int id;
    private String status;

    public RefStatusRepository(String status) {
        this.status = status;
    }

    public RefStatusRepository() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefStatusRepository that = (RefStatusRepository) o;

        if (id != that.id) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
