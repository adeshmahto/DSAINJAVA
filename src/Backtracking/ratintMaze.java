package Backtracking;

import java.util.Scanner;

public class ratintMaze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        PathInMaze(1,1,n,m,"");

    }

    private static void PathInMaze(int sr1, int sr2, int dr1, int dr2, String psf) {
        if(sr1> dr1 || sr2>dr2)
            return;
        if(sr1==dr1 && sr2==dr2){
            System.out.println(psf);
            return;
        }


        PathInMaze(sr1,sr2+1,dr1,dr2,psf+"h");
        PathInMaze(sr1+1,sr2,dr1,dr2,psf+"v");
    }
}
