package my.project.autodealer.model;

/**
 * Created by Nikol on 1/29/2017.
 */
public class Carbody {
    private int id;
    private String carBody;

    public Carbody(String carBody) {
        this.carBody = carBody;
    }

    public Carbody() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carbody that = (Carbody) o;

        if (id != that.id) return false;
        if (carBody != null ? !carBody.equals(that.carBody) : that.carBody != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (carBody != null ? carBody.hashCode() : 0);
        return result;
    }
}
