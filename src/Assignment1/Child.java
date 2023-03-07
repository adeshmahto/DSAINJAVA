package Assignment1;
public class Child extends Parent {
    String Address;
    Child(int age, String name, String Address) {
        super(age, name);
        this.Address = Address;
    }

    public void display() {
        System.out.println("Address->" + Address);
    }

}
