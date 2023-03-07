package Assignment7;

import java.util.Scanner;
public class HumanRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("enter the name:");
        String name=sc.next();
        SubHuman sh=new SubHuman(age,name);
        System.out.println(sh.age);
        sh.m1();
        sh.m2();
        sh.displayAge();





    }
}
