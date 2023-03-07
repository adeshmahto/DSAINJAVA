package Striversheet.Day8.JObSequence;



import Striversheet.Day8.JObSequence.Job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Job>arr=new ArrayList<>();

       Scanner sc=new Scanner(System.in);
       System.out.println("******************^******************");
       System.out.println("Enter the number of job:");
       int n=sc.nextInt();
       int profit;
       int jobid;
       int deadline;
        for (int i = 0; i <n ; i++) {
            System.out.println("enter the id of job:");
            jobid=sc.nextInt();
            System.out.println("enter the profit of from that job "+jobid);
            profit=sc.nextInt();
            System.out.println("enter the deadline of from that job "+jobid);
            deadline=sc.nextInt();
            arr.add(new Job(jobid,deadline,profit));
        }

        Collections.sort(arr,(a,b)->b.profit-a.profit); // decending
        //finding max deadline
        int max=0;
        for (int i = 0; i <arr.size() ; i++) {
            if(arr.get(i).deadline>max){
                max=arr.get(i).deadline;
            }

        }
        boolean result[]=new boolean[max+1];// 0 1 2 3 4
        System.out.println(result.length);
        int totalprofit=0;
        int count=0;
        for (int i = 0; i <arr.size() ; i++) {         // traversing all the object

            for (int j = arr.get(i).deadline; j >0 ; j--) {               // taking each object  and place in free slot    // here j start 3 if only taken max length of result it will goes to 3 only

                if(result[j]==false){
                    result[j]=true;
                    totalprofit+=arr.get(i).profit;
                    count++;
                    break;

                }
            }
        }
        System.out.println(count);
        System.out.println(totalprofit);

    }

}
