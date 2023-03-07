package DynamicProgramming;

public class ClimbToStair {
    public static void main(String[] args) {

        int n=6;
        System.out.println(CTOsT(n));


    }
    //memorization and recursion
    public static int CTOS(int n,int dp[]){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];
        int c=CTOS(n-1,dp)+CTOS(n-2,dp)+CTOS(n-3,dp);
        dp[n]=c;
        return c;
    }
    // tabulation
    public  static int CTOsT(int n){
        int dp[]=new int[n+1];
        //base case
        dp[0]=1;
        for (int i = 1; i <=n ; i++) {
            if(i==1) {
                dp[i] = dp[i - 1];
            }
           else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }

        }
        return dp[n];
    }
}
