import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleOfLinkedHashSet {

// it maintain order of element and it does't allow duplicate value.
    public static void test() {
        LinkedHashSet<String> studentNames = new LinkedHashSet<>();
        studentNames.add("kanit");
        studentNames.add("rahul");
        studentNames.add("ashu");
        studentNames.add("kanit");
        studentNames.add("latesh");
        studentNames.add("kartik");
        studentNames.add(null);
        System.out.println(studentNames);
        System.out.println(studentNames.size());
    }

    public static void main(String[] args) {
        test();
    }
}
