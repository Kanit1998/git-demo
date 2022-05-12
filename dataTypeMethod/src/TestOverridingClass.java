public class TestOverridingClass extends TestOverriding{
    @Override
    public void run() {
        System.out.println("Test overriding class");
    }
    public static void main(String[]args){
        TestOverridingClass testOverridingClass=new TestOverridingClass();
        testOverridingClass.run();
    }
}
