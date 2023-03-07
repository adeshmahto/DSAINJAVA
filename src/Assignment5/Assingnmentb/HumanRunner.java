package Assignment5.Assingnmentb;

import java.util.Scanner;

public class HumanRunner {
    public static void main(String[] args) {
        SubSubHuman ssh=new SubSubHuman();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("enter the name:");
        String name=sc.next();
        ssh.age=age;
        ssh.name=name;
        ssh.display();

    }
}
