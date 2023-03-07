package DynamicProgramming;

import java.awt.desktop.ScreenSleepEvent;

public class BinomialCofficient {
    public static void main(String[] args) {

       System.out.println(NcR(4,2));

  }
  static  int NcR(int n,int r){
        if(n<r) return 0;
        if((n-r)<r){
            r=n-r;
        }
        int dp[]=new int[r+1];
        dp[0]=1;

        for(int i=1;i<=n;i++){
            for(int j=Math.min(r,i);j>0;j--){
                dp[j]=dp[j]+dp[j-1];
            }
        }
        return dp[r];
  }


}
