public class MultipleCatch {

    public static void main(String[] args) {
        demo();
    }

    public static void demo(){
        try{
            String s=null;
            s.length();

        }catch(ArithmeticException ex){
            System.out.println("Arithmatic");
        }catch(NullPointerException ex){
            System.out.println("Null pointer");
        }catch(Exception ex){
            System.out.println(" Exception class");
        }

    }
}
