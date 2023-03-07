package Striversheet.Day4;

import Access.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {


       int arr[]={2,7,11,15};
       int target=9;
       System.out.println(TwoSum2(arr,9)[0]);







    }

    //brute force element

    public  static int [] TwoSum1(int arr[],int target){

        ArrayList<Integer> ans=new ArrayList<>();



        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; (j!=i && j < arr.length ); j++) {
                if(arr[i]+arr[j]==target){
                    ans.add(i);
                    ans.add(j);

                }

            }

        }

        int b[]=new int[ans.size()];
        b[0]=ans.get(0);
        b[1]=ans.get(1);


        return b;

    }


    //optimise solution
    public static int[] TwoSum2(int nums[],int target){
        Map<Integer,Integer>map=new HashMap<>();
        int result[]=new int[2];
        for (int i = 0; i <nums.length ; i++) {
            int tar=target-nums[i];
            if(map.containsKey(tar)){
                result[0]=i;
                result[1]=map.get(tar);

            }else {
                map.put(nums[i],i);
            }


    }
        return result ;
    }
}




