public class Constructor {
    String name;
    int age;
    public Constructor(){
        System.out.println("Constructor called");
        System.out.println("Default value of name: "+name+"default value of age:"+age);
    }
    public static void main(String[]args){
        new Constructor();
        System.out.println("Main method called");

    }
}

