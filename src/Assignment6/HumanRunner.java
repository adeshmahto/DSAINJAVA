package Assignment6;

import java.util.Scanner;

public class HumanRunner {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("enter the name:");
        String name=sc.next();
        SubHuman sh=new SubHuman();
        sh.age=age;
        sh.name=name;
        sh.display(age);
        sh.display(name);
    }
}
