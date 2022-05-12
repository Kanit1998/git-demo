import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ExampleOfHashSet {

    //Set won't allow duplicate element and set does not maintain any order.

    public static void test(){
        Set<String> studentNames=new HashSet<>();
        studentNames.add("kanit");
        studentNames.add("rahul");
        studentNames.add("kartik");
        studentNames.add("kanit");
        studentNames.add("laetsh");
        studentNames.add("ishu");
        System.out.println(studentNames);
        System.out.println(studentNames.size());
        ArrayList<String> studentNames1=new ArrayList<>();
        studentNames1.add("sanjay");
        studentNames1.add("ishu");
        System.out.println(studentNames1);

    }

    public static void main(String[] args) {
        test();
    }
}
