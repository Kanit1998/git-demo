public class  ExampleOfMultilevelInheritance extends ImplementAbstract{
    void multiLevel() {
        int n1 = 2, n2 = 115, sum;
        sum = n1 + n2;
        System.out.println("The sum of numbers is: "+sum);
    }
public static void main(String[]args){
        ExampleOfMultilevelInheritance e=new ExampleOfMultilevelInheritance();
        ImplementAbstract i=new ImplementAbstract();
        e.multiLevel();
        i.testMethod();
        i.testMethod1();
}
}
