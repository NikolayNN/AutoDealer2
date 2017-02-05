package my.project.autodealer.dao.repositories;


/**
 * Created by Nikol on 1/29/2017.
 */

public class RefConditionRepository {
    private int id;
    private String condition;

    public RefConditionRepository(String condition) {
        this.condition = condition;
    }

    public RefConditionRepository() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefConditionRepository that = (RefConditionRepository) o;

        if (id != that.id) return false;
        if (condition != null ? !condition.equals(that.condition) : that.condition != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        return result;
    }
}
