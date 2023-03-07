package Striversheet.Day4;

import java.util.HashMap;

public class CountXor {
    public static void main(String[] args) {

        System.out.println(Subarray(new int[]{4,2,2,6,4},6));

    }
    public static  int Subarray(int arr[],int k){

        HashMap<Integer,Integer>freq=new HashMap<>();


        int count=0;
        int xor=0;
        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            xor=xor^arr[i];
            if(freq.get(xor^k)!=null){
                count+=freq.get(xor^k);
            }
            if(xor==k)  count++;

            if(freq.get(xor)!=null){
                freq.put(xor,freq.get(xor)+1);
            }else {
                freq.put(xor,1);
            }
        }

        return count;

    }
}
