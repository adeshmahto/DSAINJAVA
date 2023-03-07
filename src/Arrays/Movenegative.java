package Arrays;

import java.util.Collection;
import java.util.Collections;


public class Movenegative {
    public static void main(String[] args) {
        int arr[]={-1,2,-3,4,-5,-9};

        // using partition(quicksort)

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){

                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                }
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
