// polymorphism:: Doing same thing in different ways
//Method overloading: 1. Done in same class.
// 2. Method name should be same.
//  3. only changing the return type wont work we need to change the number of parameter or datatype of parameter.
//Method overriding: Done in another class.
public class TestPolymorphism {
    public int sumNumbers(int a, int b){
        a=23;
        b=45;
        return a+b;
    }
    public int sumNumbers(int a, int b, int c){
        a=78;
        b=56;
        c=67;
        return a+b+c;
    }
    public void sumNumbers(){
        int a=56;
        int b=67;
       System.out.println(a+b);
    }
}
