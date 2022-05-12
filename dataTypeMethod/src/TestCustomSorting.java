import java.util.ArrayList;
import java.util.HashSet;

public class TestCustomSorting {
    public static void test() {
        HashSet<Cars> carsList = new HashSet<>();
        Cars c1 = new Cars();
        c1.setName("Bmw");
        c1.setId(1);
        carsList.add(c1);

        Cars c2 = new Cars();
        c2.setName("Audi");
        c2.setId(2);
        carsList.add(c2);

        Cars c3 = new Cars();
        c3.setName("Audi");
        c3.setId(3);
        carsList.add(c3);



        System.out.println(carsList);

    }

    public static void main(String[] args) {
        test();
    }


}

