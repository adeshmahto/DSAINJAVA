package CompanyOriented.Mindtree;

import java.util.Arrays;
import java.util.Scanner;

public class SelfSufficient {
    public static void main(String[] args) {

              //no. of book to buy

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        System.out.println("enter the array1 value");
        for (int i = 0; i <N ; i++) {
            a[i]=sc.nextInt();

        }
        System.out.println("enter the array2 value");
        for (int i = 0; i <N ; i++) {
            b[i]=sc.nextInt();

        }

        for (int i = 0; i <N ; i++) {
            a[i]=b[i]-a[i];
        }
        int sum=0;
        for(int e:a){
            sum+=e;
        }
        System.out.println(sum);




    }
}
