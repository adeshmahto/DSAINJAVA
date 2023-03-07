package Assignment6;

 public class SubHuman extends Human{      // public access modifier

    protected String name;
    @Override
    void display(int age){
        System.out.println("age "+age);
    }
    void display(String name){
        System.out.println("name "+name);
    }


}
