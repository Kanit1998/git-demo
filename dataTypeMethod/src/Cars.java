import java.util.Objects;

public class Cars {


    private String Name;
    private int Id;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cars)) return false;
        Cars cars = (Cars) o;
        return Id == cars.Id && Objects.equals(Name, cars.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Id);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                '}';
    }
}
