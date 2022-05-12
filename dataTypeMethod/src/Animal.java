import java.util.Objects;

public class Animal {

    private int Id;
    private String Name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Id == animal.Id && Objects.equals(Name, animal.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                '}';
    }
}
