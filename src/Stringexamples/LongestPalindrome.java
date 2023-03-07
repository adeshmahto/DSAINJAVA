package Stringexamples;

public class LongestPalindrome {
    public static void main(String[] args) {

    }
    static void lp(String st){
        int n=st.length();
        int dp[][]=new int[n][n];

        for(int diff=0;diff<n;diff++){
            for(int i= 0,j=i+diff;j<n;i++,j++){
                if(i==j){
                    dp[i][j]=1;
                }else{

                }
            }
        }
    }
}
