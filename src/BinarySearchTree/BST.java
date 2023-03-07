package BinarySearchTree;

public class BST {

   public Node createNode(int val){
        Node n=new Node();
        n.data=val;
        n.left=null;
        n.right=null;
        return n;
    }
    public Node BuildingBst(Node node, int val){
        if(node==null) return createNode(val);
        if(val >node.data){
            node.right=BuildingBst(node.right,val);
        }
        if(val<node.data){
            node.left=BuildingBst(node.left,val);
        }
        return node;
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node next; // for the populate inorder successor question
}