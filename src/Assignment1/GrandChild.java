package Assignment1;

public class GrandChild extends Child{
    char gender;
    GrandChild(int age,String name ,String Address,char gender){
        super(age,name,Address);
        this.gender=gender;
    }
    public void display(){
        System.out.println("Gender->"+gender);
    }

}
