package Graphim;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
   private LinkedList<Integer>arr[];
    Graph(int v){
        arr=new LinkedList[v];
        for(int i=0;i<v;i++){
            arr[i]=new LinkedList<>();
        }
    }
    public  void addsd(int source,int destination){
        arr[source].add(destination);
        arr[destination].add(source);
    }

    public  void PrintGraph(int v){
        for(int i=0;i<v;i++){
            System.out.print(i+"->");
            for(int j=0;j<arr[i].size();j++){
                System.out.print(arr[i].get(j)+" ");
            }
            System.out.println();
        }
    }

    public void Bfs(int source ,int destination){
        boolean vis[]=new boolean[arr.length];
        int parent[]=new int[arr.length];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        vis[source]=true;
        parent[source]=-1;
        while (!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination)break;

            for(int neigh:arr[curr]){

                if(!vis[neigh]){
                    vis[neigh]=true;
                    q.add(neigh);
                    parent[neigh]=curr;
                }

            }
        }

        int curr=destination;
        int distance=0;
        while (parent[curr]!=-1){
            System.out.print(curr+"->");
            curr=parent[curr];
            distance++;


        }
        System.out.println("distance from source to destination "+distance);
    }

    public  boolean Dfs(int source,int destination){
        boolean vis[]=new boolean[arr.length];
        Stack<Integer> stk=new Stack<>();
        stk.add(source);
        vis[source]=true;
        while (!stk.isEmpty()){
            int curr=stk.pop();
            if(curr==destination) return true;
            for(int neigh:arr[curr]){
                if(!vis[neigh]){
                    vis[neigh]=true;
                    stk.add(neigh);
                }
            }
        }
        return false;

    }
    // recursion
    private boolean dfsUtil(int source,int destination, boolean vis[]) { // recursive method
        if(source==destination) return true;

        for(int neighbour: arr[source]) {
            if(!vis[neighbour]) {
                vis[neighbour]=true;
                boolean isConnected= dfsUtil(neighbour,destination, vis);
                if(isConnected) return true;
            }
        }
        return false;
    }
    public boolean dfs(int source,int destination) {
        boolean vis[]=new boolean[arr.length];
        vis[source]=true;
        return dfsUtil(source,destination,vis);
    }

}
