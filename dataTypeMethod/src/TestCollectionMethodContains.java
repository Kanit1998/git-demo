import java.util.ArrayList;

public class TestCollectionMethodContains {
    public static void test(){
        ArrayList<String> namesOfStudents= new ArrayList<>();
         namesOfStudents.add("rahul");
         namesOfStudents.add("chetan");
         namesOfStudents.add("akshay");
         namesOfStudents.add("rahul");
       // System.out.println("output :: "+ namesOfStudents.contains("rahul")); it check the collection of arraylist is present or not
        //System.out.println("output :: "+ namesOfStudents.isEmpty());
       // System.out.println(namesOfStudents.remove(1));// remove the element and index of an arraylist
        //System.out.println(namesOfStudents.size());
        //namesOfStudents.clear(); //it should clear everthing of my list
        System.out.println(namesOfStudents.size());
        System.out.println(namesOfStudents.indexOf("rahul"));// to the first occurance
        System.out.println((namesOfStudents.lastIndexOf("rahul")));// the last index

    }

    public static void main(String[] args) {
        test();
    }
}
