package Graphim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int e,v;
        System.out.println("enter the Vertice and edges:");
        v=sc.nextInt();
        e=sc.nextInt();
        Graph graph=new Graph(v);
        for(int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();

            graph.addsd(source,destination);
        }
        System.out.println("enter the source and distance");
        int s=sc.nextInt();
        int d=sc.nextInt();
        graph.Bfs(s,d);
        System.out.println(graph.Dfs(s,d));


     //   graph.PrintGraph(v);
    }
}
