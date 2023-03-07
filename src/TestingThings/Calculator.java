package TestingThings;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x,y,t;

        for(;;){
            System.out.println("****************************");
            System.out.println("click 1 to add two number");
            System.out.println("click 2 to mul two number");
            System.out.println("click 3 to sub two number");
            System.out.println("click 4 to div two number");
            System.out.println("****************************");

            System.out.println("Select the option: ");
            t=sc.nextInt();
            System.out.println("Enter the number: ");
            x=sc.nextInt();
            y=sc.nextInt();
            switch (t){
                case 1:
                 System.out.println(add(x,y));
                    break;
                case 2:
                    System.out.println(mul(x,y));
                    break;
                case 3:
                    System.out.println(sub(x,y));
                    break;
                case 4:
                    try{
                        System.out.println(div(x,y));
                    }catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("wrong click");

            }
        }

    }
    static int  add(int x,int y){
        return x+y;
    }
    static int mul(int x,int y){
        return x*y;
    }
    static int sub(int x,int y){
        return x-y;
    }
    static double div(int x,int y){
        return x/y;
    }
}
