package BinaryTree;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        binaryimp b=new binaryimp();
        Node root=b.createTree();
        ArrayList<Integer> arr=new ArrayList<>();
       leftview(root,arr,0);

       System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
        System.out.println(arr.get(3));
    }

    public static void leftview(Node root , ArrayList<Integer> arr,int level) {

        if(root==null) return;

        if(level==arr.size()){
            arr.add(root.data);
        }
        leftview(root.left,arr,level+1);
        leftview(root.right,arr,level+1);
    }
    public static void Rightview(Node root , ArrayList<Integer> arr,int level) {

        if(root==null) return;

        if(level==arr.size()){
            arr.add(root.data);
        }
        Rightview(root.right,arr,level+1);
        Rightview(root.left,arr,level+1);

    }



}

