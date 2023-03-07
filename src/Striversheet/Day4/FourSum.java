package Striversheet.Day4;
import  java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int []nums = {2,2,2,2,2} ;
        int target = 8;
           System.out.println(FourSum(nums,target));
    }

    public static List<List<Integer>> FourSum(int nums[],int target){

        ArrayList<List<Integer>> res=new ArrayList<>();
        if(nums==null || nums.length==0) return res;
        int n=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {

                int target2=target-nums[j]-nums[i];    //i and j and check for the remaining which given by the font and back or(left and right)
                //left and right
                int font=j+1;     // starting after the j pointer
                int back=n-1;      // starting from the last index
                while (font<back){
                    int twoSum=nums[font]+nums[back]; // adding left and right
                    if(twoSum<target2) font++;
                    else if(twoSum>target2) back--;
                    else{
                        List<Integer>quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[font]);
                        quad.add(nums[back]);
                        res.add(quad);

                        //Processing the duplicates of number x (if we get the font pointer duplicate then jump)
                        while (font<back && nums[font]==quad.get(2))++font;   //2 is because at 2 index font is stored
                        //both the loop will run for font to back only
                        //Processing the duplicaes of number y( if we get the bck pointer duplicate the jump)
                        while (font<back && nums[back]==quad.get(3))--back;  //3 is because at 3 index back is stored

                    }

                }
                //Processing the duplicates of number of j
                //3222
                while (j+1 <n && nums[j+1]==nums[j])++j; // (j)it will move until any number is not matched with the previous number



            }
            while (i+1<n && nums[i+1]==nums[i])++i; //same as i

        }
        return res;
    }
}
