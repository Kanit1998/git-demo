import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class TestListHashMap {

    public static void test() {
        LinkedHashMap<Integer, String> developersLocation = new LinkedHashMap<>();
        developersLocation.put(2, "delhi");
        developersLocation.put(1, "manali");
        developersLocation.put(3, "kullu");
        developersLocation.put(3, "Shimla");
        developersLocation.put(4, "mandi");
        developersLocation.put(5, "WB");
        developersLocation.put(6, "Mumbai");
        System.out.println(developersLocation);

    }

    public static void main(String[] args) {
        test();
    }
}
