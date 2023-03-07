package Striversheet.Day4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int nums[]={100,2,3,200,4,1};
        HashSet<Integer>hashSet=new HashSet<>();
        Arrays.stream(nums).forEach(e->{
            hashSet.add(e);
        });

        final Integer[] longest = {0};

        Arrays.stream(nums).forEach(num->{

            if(!hashSet.contains(num-1)){
                int curNum=num+1;
                int count=1;
                while (hashSet.contains(curNum)){
                    curNum++;
                    count++;
                }
                longest[0] =Math.max(longest[0],count);

            }

        });
        System.out.println(longest[0]);




    }
}
