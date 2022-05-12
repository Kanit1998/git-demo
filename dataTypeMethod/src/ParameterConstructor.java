public class ParameterConstructor {
    String name;
    int age;

    public ParameterConstructor(String name , int age) {

         this.name = name;
         this.age = age;
    }
    public void test(){
        System.out.println("Name: "+name + " and age : "+age);
    }
    public static void main(String[]args){
        ParameterConstructor p = new ParameterConstructor(  "kanit",  23);
        p.test();
    }
}
