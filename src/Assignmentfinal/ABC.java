package Assignmentfinal;


import java.io.IOException;
import java.util.Scanner;
import java.util.zip.InflaterOutputStream;

public class ABC {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        try{
            int age=sc.nextInt();
            System.out.println(age);

        }catch (Exception e){
            throw new IOException("enter correct input");
        }

    }
}
