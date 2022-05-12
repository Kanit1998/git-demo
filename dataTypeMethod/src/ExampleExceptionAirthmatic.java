public class ExampleExceptionAirthmatic {
    public static void demo(){
        try{
            int a=10/0;
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }

    }
    public static void main(String[]args){
        demo();
        System.out.println("my code");
    }
}
