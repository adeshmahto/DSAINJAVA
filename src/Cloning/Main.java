package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human adesh=new Human(2,"adesh mahto");

        Human copy=(Human)adesh.clone();
        System.out.println(copy.name+" "+copy.roll);

      copy.arr[0]=100;
      System.out.println(adesh.arr[0]);
    }
}
