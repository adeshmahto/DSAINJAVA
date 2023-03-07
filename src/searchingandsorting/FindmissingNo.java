package searchingandsorting;

import java.util.Collections;




public class FindmissingNo {
    public static void main(String[] args) {



     int arr[]=new int[]{13, 33, 43 ,16, 25, 1,9 ,23 ,31 ,29 ,35 ,10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41 ,18 ,5 ,17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44 ,14 ,36, 7 ,38, 12, 1, 42, 12, 28, 22, 45};
        for (int i = 0; i <arr.length ; i++) {

            int crrtpos=arr[i]-1;
            // it is correcting the position of the each number
            while ((1<= arr[i] && arr[i]<=arr.length ) && arr[i]!=arr[crrtpos]){       //avoiding -ve value and checking correctposition
               arr[i]=arr[i]^arr[crrtpos];
               arr[crrtpos]=arr[i]^arr[crrtpos];
               arr[i]=arr[i]^arr[crrtpos];
               crrtpos=arr[i]-1;      //now arr[i] has changed and it might need to swip again    // keep the while loop active  and swapping the no. not goes to it correct position
            }

        }

        for (int i = 0; i <arr.length ; i++) {
            if((i+1)!=arr[i]){
               System.out.println(i+1);
               return;
            }
        }
        System.out.println(arr.length+1);

    }
}
