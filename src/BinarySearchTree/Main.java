package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BST b=new BST();
        Node node=null;
        node =b.BuildingBst(node,10);
        node=b.BuildingBst(node,11);
        node=b.BuildingBst(node,9);
        node=b.BuildingBst(node,7);
        node=b.BuildingBst(node,0);


        System.out.println(getsuccessor(node).data);














    }
    // find min element in tree
    public static  Node getsuccessor(Node node) {       // it will give the left leaf;
        if(node==null) {
            return null;
        }
        Node temp=node.right;
        while(temp.left!=null) {
            temp=temp.left;      //
        }
        return temp;                // return the leaf (last node)
    }


}
