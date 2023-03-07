package BinarySearchTree;

public class PopulateInordersuccessor {
    public static void main(String[] args) {
        BST b=new BST();
        Node node=null;
        node =b.BuildingBst(node,10);
        node=b.BuildingBst(node,11);
        node=b.BuildingBst(node,9);
        node=b.BuildingBst(node,7);
        node=b.BuildingBst(node,0);

    }
    static void PopulateIn(Node root,Node pre){
        if(root==null){
           return;
        }
        PopulateIn(root.left,pre);
        if(pre!=null){
            pre.next=root;
        }
        pre=root;

        PopulateIn(root.right,pre);
    }
}
