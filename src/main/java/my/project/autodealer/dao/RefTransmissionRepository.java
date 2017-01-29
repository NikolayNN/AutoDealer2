package my.project.autodealer.dao;

/**
 * Created by Nikol on 1/29/2017.
 */
public class RefTransmissionRepository {
    private int id;
    private String transmission;

    public RefTransmissionRepository(String transmission) {
        this.transmission = transmission;
    }

    public RefTransmissionRepository() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefTransmissionRepository that = (RefTransmissionRepository) o;

        if (id != that.id) return false;
        if (transmission != null ? !transmission.equals(that.transmission) : that.transmission != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (transmission != null ? transmission.hashCode() : 0);
        return result;
    }
}
