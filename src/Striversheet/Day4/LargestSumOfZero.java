package Striversheet.Day4;

import java.util.HashMap;

public class LargestSumOfZero {
    public static void main(String[] args) {

        int nums[]=new int[]{15,-2,2,-8,1,7,10,23};
        int max=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            if(sum==0){
                max+=1;
            }
            else{
                if(map.containsKey(sum)){
                    max=Math.max(max,i-map.get(sum));

                }else {
                    map.put(sum,i);
                }
            }

        }
        System.out.println(max);
    }
}
