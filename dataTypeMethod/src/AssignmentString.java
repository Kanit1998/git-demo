public class AssignmentString {
    public static void main(String[] args) {
        String s1=  "Amb2an9i is4 ric0he1st pe2rso7n";
        s1 = s1.replaceAll("[012346789]", "");
        System.out.print("Output without number: " + s1);
    }

}
