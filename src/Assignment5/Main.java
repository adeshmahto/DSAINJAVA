package Assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human h=new Human();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("enter the name");
        String name=sc.next();

        h.display(age);
        h.display(name);
    }
}
