package Java8.MethodRefrence.constructor;

public class Main {
    public static void main(String[] args) {
        //constructor reference;
        Provider provider=Student::new;

        provider.getStudent().display();
    }
}
