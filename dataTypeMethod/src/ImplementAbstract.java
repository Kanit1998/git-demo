public class ImplementAbstract extends TestAbstract{

    @Override
    void testMethod() {
        System.out.println("Abstract method");
    }

    @Override
    void testMethod1() {
        int n1 = 225, n2 = 115, sum;
        sum = n1 + n2;
        System.out.println("The sum of numbers is: "+sum);
    }

    public static void main(String[] args) {
        ImplementAbstract i=new ImplementAbstract();
        i.testMethod();
        i.testMethod1();
    }
}
