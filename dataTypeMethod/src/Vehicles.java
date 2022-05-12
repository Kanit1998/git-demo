import java.util.Objects;

public class Vehicles {

    private int Id;
    private String Carname;
    private int Model;
    private int Kilometers;
    private String Price;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCarname() {
        return Carname;
    }

    public void setCarname(String carname) {
        Carname = carname;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int model) {
        Model = model;
    }

    public int getKilometers() {
        return Kilometers;
    }

    public void setKilometers(int kilometers) {
        Kilometers = kilometers;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicles)) return false;
        Vehicles carsData = (Vehicles) o;
        return Id == carsData.Id && Model == carsData.Model && Kilometers == carsData.Kilometers && Objects.equals(Carname, carsData.Carname) && Objects.equals(Price, carsData.Price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Carname, Model, Kilometers, Price);
    }


    @Override
    public String toString() {
        return "CarsData{" +
                "Id=" + Id +
                ", Carname='" + Carname + '\'' +
                ", Model=" + Model +
                ", Kilometers=" + Kilometers +
                ", Price='" + Price + '\'' +
                '}';
    }
}