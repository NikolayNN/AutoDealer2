package my.project.autodealer.dao;

/**
 * Created by Nikol on 1/29/2017.
 */
public class RefMakerRepository {
    private int id;
    private String manufactor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefMakerRepository that = (RefMakerRepository) o;

        if (id != that.id) return false;
        if (manufactor != null ? !manufactor.equals(that.manufactor) : that.manufactor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (manufactor != null ? manufactor.hashCode() : 0);
        return result;
    }
}
