package Striversheet.Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

     static List<List<Integer>> res=new ArrayList();
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //for the sorted algo
        for(int i=0;i<nums.length;i++){

            //if a should not duplicate
            if(i==0 || nums[i-1]!=nums[i]){
                twoSumSorted(i+1,nums.length-1,nums,0-nums[i]);// 0-a target
            }

        }


        return res;
    }
   static void twoSumSorted(int i,int j,int []nums,int target){

        int a1=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target){// when we get larger number j pointer mover right- left side
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{ //found
                List<Integer>list =new ArrayList();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                res.add(list);
                //for duplicate  b and c
                while(i<j && nums[i]==nums[i+1])i++;// skip
                while(i<j && nums[j]==nums[j-1])j--;
                i++;j--;


            }
        }

    }
}
