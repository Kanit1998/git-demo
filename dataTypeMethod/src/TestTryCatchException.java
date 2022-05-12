//whenever code you think can give error/ exception we need to write here
public class TestTryCatchException {


    String s=null;


    public void tryCatchException(){
        try{
            System.out.println(s.length());
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new TestTryCatchException().tryCatchException();
    }
}
