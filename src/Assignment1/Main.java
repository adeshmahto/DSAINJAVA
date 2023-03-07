package Assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("enter the name");
        String name=sc.next();
        System.out.println("enter the Address");
        String Address=sc.next();
        System.out.println("enter the gender");
        char gender= sc.next().charAt(0);
        GrandChild g=new GrandChild(age,name,Address,gender);

        System.out.println("My name is "+g.name+" and my age is "+g.age +" and i am from "+g.Address);

    }
}
