import java.util.ArrayList;

public class StudentsArrayLIst {

    public static void testArrayListFunctionality(){
        ArrayList<Students> studentsList = new ArrayList<>();
        Students s1=new Students();
        s1.setStudentName("Rahul");
        s1.setAddress("Mandi");
        s1.setMobileNumber(821967898);
        s1.setPinCode(176869);
        studentsList.add(s1);


        Students s2= new Students();
        s2.setStudentName("Anku");
        s2.setAddress("Kulu");
        s2.setMobileNumber(546537389);
        s2.setPinCode(543539);
        studentsList.add(s2);

        System.out.println(studentsList);
    }


    public static void main(String[] args) {
        testArrayListFunctionality();
    }

}
