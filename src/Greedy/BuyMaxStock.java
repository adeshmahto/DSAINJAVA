package Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class BuyMaxStock {
    public static void main(String[] args) {
        int n=3; // no. of stocks
        int k=45;
        int ans=0;
        int stocks[]=new int[]{10,7,19};
        Pair [] arr=new Pair[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=new Pair(stocks[i],i+1);
        }
        Arrays.sort(arr,new Sort());
        for (int i = 0; i <n ; i++) {
            if(arr[i].first*arr[i].second<=k){
                ans+=arr[i].second;
                k-=arr[i].first*arr[i].second;

            }else{
                ans+=(k/arr[i].first);
                k-=arr[i].first*arr[i].second;
            }

        }
        System.out.println(ans);


    }
}

class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;

    }
}
class Sort implements Comparator<Pair>{
    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.first-o2.first;
    }
}
