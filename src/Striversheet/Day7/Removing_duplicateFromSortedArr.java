package Striversheet.Day7;

import java.util.Arrays;

public class Removing_duplicateFromSortedArr {
    public static void main(String[] args) {

        removeele(new int[]{0,0,1,1,2,2,3,3,4});

    }
    public  static void removeele(int arr[]) {

        int i=0;
        int j=1;
        int count=0;
        while (i< arr.length && j<arr.length){

            if(arr[i]==arr[j]){
                j++;
            }else {
                arr[++i]=arr[j];
                count++;

            }
        }
        System.out.println("count" +count);
        Arrays.stream(arr).forEach(e->System.out.println(e));


    }

}
