public class TestMultipleExceptionUsingOneTryCatch {


    public static void demo(){
        try {
            int a = 3/0;
        }catch( NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
