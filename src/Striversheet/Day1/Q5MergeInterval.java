package Striversheet.Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5MergeInterval {
    public static void main(String[] args) {
        int intervals[][]={{1,2},{2,3}};

        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        if(intervals.length==0 && intervals==null)
            System.out.println(res.toArray(new int[0][]));

        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i[]:intervals){
            if(i[0]<=e){
                e=Math.max(e,i[1]);
            }else {
                res.add(new int[]{s,e});
                s=i[0];
                e=i[1];
            }
            res.add(new int[]{s,e});
            System.out.println(res.toArray(new int[0][]));
        }

    }

}
