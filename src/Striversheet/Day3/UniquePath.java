package Striversheet.Day3;

public class UniquePath {
    public static void main(String[] args) {

        int n=2,m=3;
//        int dp[][]=new int[n][m];
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//                dp[i][j]=-1;
//            }
//
//        }
//
//        System.out.println(CountPathDp(0,0,n,m,dp));
        System.out.println(uniquePath(n,m));


    }

    //brute force
   static int  CountPath(int i,int j,int n,int m){
        if(i==n-1 && j==m-1) return 1;
        if(i>=n || j>=m) return 0;
        else {
            int down=CountPath(i+1,j,n,m);
            int right=CountPath(i,j+1,n,m);
            return down+right;
        }
    }
    //using dp
    static  int CountPathDp(int i,int j,int n,int m,int dp[][]){
        if(i==n-1 && j==m-1) return 1;
        if(i>=n || j>=m) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        else return dp[i][j]=CountPathDp(i+1,j,n,m ,dp)+CountPathDp(i,j+1,n,m,dp);



    }
    //optimise
    static  int uniquePath(int m,int n){
        int N=n+m-2;
        int r=m-1;
        double res=1;
        for (int i = 1; i <=r ; i++) {
            res=res*(N-r+i)/i;

        }
        return (int)res;
    }

}
