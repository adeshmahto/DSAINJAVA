package DynamicProgramming;

public class CoinChange {
    public static void main(String[] args) {

        int amount=4;
        int coins[]={1,2,3};
        int dp[]=new int[amount+1];
        dp[0]=1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<dp.length;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        System.out.println(dp[amount]);
    }
}
