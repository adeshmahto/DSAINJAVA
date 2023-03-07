package Assignment7;

public class SubHuman extends Human {
    String name;
    void m1(){
        System.out.println("calling the age from Human class->"+super.age);
    }
    SubHuman(int age,String name1){
        super(age);
        name=name1;
    }

    void m2(){
        System.out.print("calling the displayAge method from human class->");
        super.displayAge();
    }
}
