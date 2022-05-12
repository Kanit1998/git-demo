import java.util.ArrayList;

public class TestCollectionFrameworkSizeAddGet {
    public static void test(){
        ArrayList<String> namesOfStudents=new ArrayList<>();
        namesOfStudents.add("kanit");
        namesOfStudents.add("anku");
        namesOfStudents.add("deepu"); // used to add element to list/collection.
       // System.out.println(namesOfStudents.size()); it is used to size of get collection
        System.out.println(namesOfStudents.get(0)); // it take index of an array
    }

    public static void main(String[] args) {
        test();
    }
}
