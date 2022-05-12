public class UsingTryCatch {

    public static void main(String[]args) {
        demo();
    }
    public static void demo(){
        try{
            int a=10/0;
        }finally {
            System.out.println("Hello world");
        }
        System.out.println("my code");

    }
}
