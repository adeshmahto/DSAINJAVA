package DynamicProgramming;

public class FibonacchiSeries {
    public static void main(String[] args) {

        int n=5;
        System.out.println(Fibo(n,new int[n+1]));

    }
    public  static  int Fibo(int n,int []dp){
        if (n==0 || n==1) return n;
        if(dp[n]!=0) return dp[n];
        int fibn=Fibo(n-1,dp)+Fibo(n-2,dp);
        dp[n]=fibn;
        return fibn;
    }
}
