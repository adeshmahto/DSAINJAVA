package Assignmentfinal.ass3;

import Interfaces.SuperCar;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class trycatchblck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
            System.out.println(z);
        }catch ( ArithmeticException e){
         System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("code successfully run");
        }
    }
}
