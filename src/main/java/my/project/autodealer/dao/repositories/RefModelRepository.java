package my.project.autodealer.dao.repositories;

/**
 * Created by Nikol on 1/29/2017.
 */
public class RefModelRepository {
    private int id;
    private String model;

    public RefModelRepository(String model) {
        this.model = model;
    }

    public RefModelRepository() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefModelRepository that = (RefModelRepository) o;

        if (id != that.id) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }
}
