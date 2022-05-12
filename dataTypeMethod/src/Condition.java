
public class Condition {
    //Conditions in java
    //do while
    //switch case
    public static void  Conditions() {
        int age = 60;
        if (age > 55) {
            System.out.println("eligible for pension");
        } else {
            System.out.println("not eligible for pension");
        }
    }

    public static void main(String[] args) {Conditions(); }
        //&& condition
        public static void  testCond () {
            int percentageBca = 90;
            int percentageMca = 80;
            if ((percentageBca > 95) && (percentageMca > 78)) {
                System.out.println("you are eligible for job");
            } else {
                System.out.println("you are not eligible for job");
            }
        }

        //|| OR condition
        public static void Cond () {
            int percentageBca = 90;
            int percentageMca = 80;
            if ((percentageBca > 95) || (percentageMca > 78)) {
                System.out.println("you are eligible for job");
            } else {
                System.out.println("you are not eligible for job");
            }
        }
    }

