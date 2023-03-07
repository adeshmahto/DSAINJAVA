package BinaryTree;

import java.util.*;

import static BinaryTree.binaryimp.createTree;

public class Main2 {
    public static void main(String[] args) {
        binaryimp b=new binaryimp();
        Node root=createTree();

        for (int i = 0; i <topview(root).size() ; i++) {
            System.out.println(topview(root).get(i));

        }
    }
    static ArrayList<Integer> topview(Node root){
        Queue<pair> q=new ArrayDeque<>();
        Map<Integer,Integer>map=new TreeMap<>();
        q.add(new pair(0,root));
        while (!q.isEmpty()){
            pair cur=q.poll();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd,cur.node.data);
            }
            if(cur.node.left!=null){
                q.add(new pair(cur.hd-1,cur.node.left));
            }
            if(cur.node.right!=null){
                q.add(new pair(cur.hd+1,cur.node.right));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    static ArrayList<Integer> Bottomview(Node root){
        Queue<pair> q=new ArrayDeque<>();
        Map<Integer,Integer>map=new TreeMap<>();
        q.add(new pair(0,root));
        while (!q.isEmpty()){
            pair cur=q.poll();
                map.put(cur.hd,cur.node.data);
            if(cur.node.left!=null){
                q.add(new pair(cur.hd-1,cur.node.left));
            }
            if(cur.node.right!=null){
                q.add(new pair(cur.hd+1,cur.node.right));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    // it has the horizontal distance and that node
    static class pair{
        int hd;
        Node node;
        public  pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }

}
