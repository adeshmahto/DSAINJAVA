package DynamicProgramming;

import java.util.Scanner;

public class KnapsackProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of object:");
        int n=sc.nextInt();
        int weight[]=new int[n];
        int value[]=new int[n];
        System.out.println("Enter the weigh and values:");
        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
            value[i]=sc.nextInt();

        }
        System.out.println("Enter the capacity:");
        int cap= sc.nextInt();
        int dp[][]=new int[n+1][cap+1];
        for(int i=1;i<dp.length;i++){         // weight column
            for(int j=1;j<dp[0].length;j++){     // capacity each
                    if (j >= weight[i-1]) {          // weight index starting from 0
                        int max=Math.max(dp[i-1][j-weight[i-1]]+value[i-1],dp[i-1][j]);
                        dp[i][j]=max;
                    }else{

                        dp[i][j]=dp[i-1][j];
                    }
            }
        }
        System.out.println(dp[n][cap]);

    }
}
