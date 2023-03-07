import java.util.ArrayList;



public class Myratinmaze {
    public static void main(String[] args) {
        int n = 4;
        int[][] a = {{1,0,0,0}
                ,{1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}};

       ArrayList<String >adesh=findpath(a,n);

        System.out.println(adesh.get(0));
    }

    public static ArrayList<String> findpath(int arr[][],int n ){
        int vis[][]=new int[n][n];
        for(int i=0;i<vis.length;i++){// initialise the visit
            for(int j=0;j<vis[0].length;j++){
                vis[i][j]=0;
            }
        }
        ArrayList<String> ans=new ArrayList<>();
        if(arr[0][0]==1){
            solve(0,0,arr,n,ans," ",vis);
        }
        return ans;

    }
    public  static void solve(int i,int j,int arr[][],int n,ArrayList<String> ans,String move,int [][] vis){ // here we see that ans arraylist changing even we passing in the solve fun its means object can change by pass by ojectt

        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        // downward direction
        if(i+1<n && vis[i+1][j]==0 && arr[i+1][j]==1){
            vis[i][j]=1;
            solve(i+1,j,arr,n,ans,move+"D",vis);
            vis[i][j]=0;
        }
        // left
        if(j-1>=0 && vis[i][j-1]==0 && arr[i][j-1]==1){
            vis[i][j]=1;
            solve(i,j-1,arr,n,ans,move+"L",vis);
            vis[i][j]=0;
        }
        //right
        if(j+1<n && vis[i][j+1]==0 && arr[i][j+1]==1){
            vis[i][j]=1;
            solve(i,j+1,arr,n,ans,move+"R",vis);
            vis[i][j]=0;
        }
        //upward
        if(i-1>=0 && vis[i-1][j]==0 && arr[i-1][j]==1){
            vis[i][j]=1;
            solve(i-1,j,arr,n,ans,move+"D",vis);
            vis[i][j]=0;
        }

    }
}
