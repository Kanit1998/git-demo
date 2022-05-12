import java.util.TreeSet;

public class DevelopersTreeSet {


    public static void developersDetail(){

        TreeSet<Developers> developersList=new TreeSet<>();
        developersList.add(new Developers(67, "kanit", "Dlithe", "25000k" ));
        developersList.add(new Developers(45,"rahul","Hcl", "30000k"));
        developersList.add(new Developers(89,"ankit","infosis","34000k"));
        System.out.println(developersList);
    }

    public static void main(String[] args) {

        developersDetail();
    }
}
