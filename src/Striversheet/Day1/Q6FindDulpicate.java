package Striversheet.Day1;

import java.util.Arrays;

public class Q6FindDulpicate {
    public static void main(String[] args) {

        int arr[]=new int []{3,1,3,4,2};

        Arrays.sort(arr);

        for (int i = 0; i <arr.length && (i+1)<arr.length ; i++) {
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
            }

        }
    }
}
