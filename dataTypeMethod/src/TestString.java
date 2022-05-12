import java.util.Locale;

public class TestString {
    public static void main (String[] args){
        String s1="kanitsharma";
        String s2="kaNit";
        String s3= new String ("kanit");
        String s4= new String("Kanit");
        System.out.println("Result :"+(s2==s1));
        System.out.println("Result of values: "+s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));
        System.out.println(s2.toUpperCase());
        System.out.println("length of the string is:"+s2.length());
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(5,6));
        System.out.println(s1.charAt(4));
        System.out.println(s1.contains("ani"));
        System.out.println("length of string"+ s1.trim().length());
        System.out.println(s2.concat("sharma"));
        System.out.println(s2.replace("N","n"));
        System.out.println(s2.replaceAll("","space"));
        System.out.println(s1.indexOf("t"));

    }
}
