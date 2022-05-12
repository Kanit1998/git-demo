public class UsingTryCatchFinally {
//with try block you can use either catch or finally block or both


    public static void demo(){
        try{
            int a=10/0;
            System.out.println(a);
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }finally{
            //mandotary code ...specially to close the connections.
            System.out.println(" CODE");
        }
    }

    public static void main(String[] args) {
        demo();
    }
}
