import java.util.HashSet;

public class VehiclesHashList {


    public static void vehiclesDetails(){
        HashSet<Vehicles> carsList= new HashSet<>();
        Vehicles c1= new Vehicles();
        c1.setCarname("Renault Kwid");
        c1.setId(67);
        c1.setKilometers(5000);
        c1.setModel(2015);
        c1.setPrice("2 lakh");
        carsList.add(c1);


        Vehicles c2 = new Vehicles();
        c2.setId(45);
        c2.setCarname("Maruti Baaleno");
        c2.setKilometers(70000);
        c2.setModel(2019);
        c2.setPrice("3.5 Lakh");
        carsList.add(c2);


        Vehicles c3 = new Vehicles();
        c3.setId(45);
        c3.setCarname("Maruti Baaleno");
        c3.setKilometers(70000);
        c3.setModel(2019);
        c3.setPrice("3.5 Lakh");
        carsList.add(c3);

        System.out.println(carsList);


    }

    public static void main(String[] args) {

        vehiclesDetails();

    }
}
