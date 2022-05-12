// whenever we feel that exception after there we need the exception handeling.
// there are 3 ways tp handle the exception.
// 1.using try catch blocks
// 2. using throws keyword
// 3. using throw keyword.
public class TestException {



    String s=null;
    public void testExceptionMethod(){
        s.length();
    }

    public static void main(String[] args) {
        new TestException().testExceptionMethod();
    }
}
