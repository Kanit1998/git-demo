public class ExampleThrowsExceptionArray {

    public void testThrowsArrayException() throws ArrayIndexOutOfBoundsException{
        String[] fruits=new String[2];
        fruits[0]="mangoo";
        fruits[1]="banana";
        fruits[2]="apple";
    }

    public static void main(String[] args) {

        new ExampleThrowsExceptionArray().testThrowsArrayException();
    }
}
