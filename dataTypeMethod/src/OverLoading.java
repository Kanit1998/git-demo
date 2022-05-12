public class OverLoading {
    String name;
    int age;
    public OverLoading(String name, int age){
        this.name = name;
        this.age = age;
    }
    public OverLoading(String name ){
        this.name = name;
    }
    public OverLoading(int age){
        this.age = age;
    }
    public void test(){
        System.out.println("name: "+name + " age : "+age);
    }

}
