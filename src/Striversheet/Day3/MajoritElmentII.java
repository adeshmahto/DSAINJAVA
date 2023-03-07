package Striversheet.Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MajoritElmentII {
    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,3,3,3};
        int num1=-1;
        int num2=-1;
        int c1=0;
        int c2=0;
        for(int e:nums){
            if(e==num1) c1++;
            else if(e==num2)c2++;
            else if(c1==0){
                num1=e;
                c1++;
            }
            else if(c2==0){
                num2=e;
                c2++;
            }
            else {
                c1--;
                c2--;
            }
        }
        List<Integer>l=new ArrayList<>();
        c1=0;
        c2=0;

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==num1) c1++;

        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==num2) c2++;

        }
        if(c1>nums.length/3) l.add(num1);
        if(c2>nums.length/3) l.add(num2);
        System.out.println(l);


    }
}
