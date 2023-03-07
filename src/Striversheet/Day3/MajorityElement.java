package Striversheet.Day3;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,1,2,2};
        int count=0;
        int element=0;
        for (int i = 0; i <arr.length ; i++) {
            if(count==0){
                element=arr[i];

            }
            if(element==arr[i]) count++;
            else count--;
        }
        System.out.println(element);


    }
}
