//Array contains elements of same datatype
//Array are indexed based
//Array start from ZERO index
public class Array {
    public static void arrayTest(){
        String[] surnames = new String[5];
        surnames[0] = "test";
        surnames[1] = "test1";
        surnames[2] = "test2";
        surnames[3] = "test3";
        surnames[4] = "test4";
        for ( int i=0; i<surnames.length; i++){
            System.out.println(surnames [i]);
        }

    }
    public static void main(String[]args){
        arrayTest();
    }

}
