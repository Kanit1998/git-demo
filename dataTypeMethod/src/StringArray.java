public class StringArray {
        public static void main(String[] args) {

    String[] strAr = {"kanit", "rahul", "ankit"};
    String[] strAr1 = new String[3];
    for (int i = 0; i<strAr.length; i++) {
        strAr1[i]= strAr[i];
    }
    for (String str : strAr1) {
        System.out.println(str);
    }
}
}
