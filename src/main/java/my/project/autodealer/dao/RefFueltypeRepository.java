package my.project.autodealer.dao;

/**
 * Created by Nikol on 1/29/2017.
 */
public class RefFueltypeRepository {
    private int id;
    private String fuelType;

    public RefFueltypeRepository(String fuelType) {
        this.fuelType = fuelType;
    }

    public RefFueltypeRepository() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefFueltypeRepository that = (RefFueltypeRepository) o;

        if (id != that.id) return false;
        if (fuelType != null ? !fuelType.equals(that.fuelType) : that.fuelType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fuelType != null ? fuelType.hashCode() : 0);
        return result;
    }
}
