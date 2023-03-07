package fsp;
import java.util.*;
public class main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        int sum=0;
//        for (int i = 1; i <=n ; i++) {
//            sum+=i;
//
//        }
//        System.out.println(sum);
//
//        int i=0;
//        while (i<n){
//            i++;
//        }
//            System.out.println(i);
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<n);
        int arr[]=new int[4];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
       int sum=0;
       for(int element:arr){
        sum+=element;
       }
        System.out.println(sum);

    }
}