public class MultipleTryCatch {
    public static void demo(){
        try{
            String s=null;
            s.length();
        }catch(NullPointerException ex){
            System.out.println("Null pointer");
        }
        try{
            int a=19/0;
        }catch(ArithmeticException ex){
            System.out.println("Arithmatic pointer");
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
