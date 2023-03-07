package BinaryTree;

import java.util.Scanner;

public class binaryimp {

      static Node createTree(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data:");
        int data=sc.nextInt();
        Node root=null;
        if (data==-1) return null;
        root=new Node(data);
        System.out.println("enter the left side of "+data);
        root.left=createTree();
        System.out.println("enter the right side of "+data);
        root.right=createTree();

        return root;

    }
  public  static  void Inorder(Node root){  // it is static because it doesnt depend upon object
        if (root==null) return;
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }
    static  void  Postoder(Node root){
        if (root==null) return;
        Postoder(root.left);
        Postoder(root.right);
        System.out.println(root.data);
    }
    static  void  Preoder(Node root){
        if (root==null) return;
        System.out.println(root.data);
        Preoder(root.left);
        Preoder(root.right);

    }

    // find height
    static int Height(Node root){
          if(root == null) return 0;
          int lh=Height(root.left);
          int rh=Height(root.right);
          return (1+Math.max(lh,rh));
    }
    // count nodes
    static int Count(Node root){
          if(root!=null){
              int l=Count(root.left);
              int r=Count(root.right);
              return 1+l+r;        // 1 is for the root node
          }else{
              return 0;
          }
    }
    // count the leaf node
    static  int LeafNode(Node root){
          if (root==null) return 0;
          if (root.left==null && root.right==null) return 1;
          else return LeafNode(root.left)+LeafNode(root.right);
    }

    //count non leaf node
    static  int NLeaf(Node root){
          if(root==null) return 0;
          if(root.left==null && root.right==null) return 0;
          else return (1+NLeaf(root.left)+NLeaf(root.right));
    }
    // diameter of tree
    static int Diam(Node root){
          if(root==null) return 0;
          int ld=Diam(root.left);
          int rd=Diam(root.right);
          int curr=1+Height(root.left)+Height(root.right);
          return Math.max(curr,Math.max(ld,rd));
    }




}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }
}
