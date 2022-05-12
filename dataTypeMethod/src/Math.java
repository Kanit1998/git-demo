public class Math {
    public static int test(int a, int b) {
        int c = a + b;
        return c;
    }

    public static char name(char c) {
        return c;
    }

    public static float multiplyNumber(float a, float b) {
        return a * b;
    }

    public static String myName() {
        String S = "kanit";
        return S;
    }

    public static void main(String[] args) {
        int sumOfTwoNumbers = test(78, 78);
        System.out.println(sumOfTwoNumbers);
        float multiplicationNumber = multiplyNumber(30, 89);
        System.out.println(multiplicationNumber);
        char character = name('h');
        System.out.println(character);
        String name = myName();
        System.out.println(name);
    }
}


//    String name;
//    static String companyName ="Dlithe";
//    public static void method(){
//        System.out.println("Method 1");
//    }
//    public void test(){
//        companyName="changed";
//        System.out.println(companyName);
//    }
//    public static void main (String[]args) {
//        new Employee
//
//    }
//}

