import java.util.LinkedHashSet;

public class AnimalLInkedHashSet {
    public static void animalsDetail(){
        LinkedHashSet<Animal> animalsList= new LinkedHashSet<>();
        Animal a1= new Animal();
        a1.setId(1);
        a1.setName("Tiger");
        animalsList.add(a1);

        Animal a2=new Animal();
        a2.setId(23);
        a2.setName("Lion");
        animalsList.add(a2);

        Animal a3 =new Animal();
        a3.setId(1);
        a3.setName("Tiger");
        animalsList.add(a3);

        System.out.println(animalsList);

    }

    public static void main(String[] args) {
        animalsDetail();
    }
}
