import java.util.HashMap;
//Map: It is used to store key value pair.
//put(): it is used to adding the value of HashMap.
//HashMap won't allow the duplicate key.
// Insertion order is maintain of HashMap.


public class TestHashMap {

    public static void test(){
        HashMap<Integer, String> developersLocation= new HashMap<>();
        developersLocation.put(1, "delhi");
        developersLocation.put(2, "manali");
        developersLocation.put(3,"kullu");
        developersLocation.put(3, "Shimla");
        developersLocation.put(4, "mandi");
        developersLocation.put(5,"WB");
        developersLocation.put(6, "Mumbai");

        System.out.println(developersLocation);
       // System.out.println("value against the passed key: "+ developersLocation.get(3));
        // System.out.println("Returns the key in the map:"+ developersLocation.keySet());
        //System.out.println(" Returns the value in the map:" +developersLocation.values());
       // System.out.println(developersLocation.containsKey(3));
        //System.out.println(developersLocation.size());
       // System.out.println(developersLocation.remove(2));
        //System.out.println(developersLocation.size());
        System.out.println(developersLocation.isEmpty());
       // developersLocation.clear();
        System.out.println(developersLocation.size());
    }

    public static void main(String[] args) {
        test();
    }
}
