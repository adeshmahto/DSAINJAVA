package BinarySearchTree;

public class checkBst {
    public static void main(String[] args) {
        BST b=new BST();
        Node node=null;
        node =b.BuildingBst(node,10);
        node=b.BuildingBst(node,11);
        node=b.BuildingBst(node,9);
        node=b.BuildingBst(node,7);
        node=b.BuildingBst(node,0);
        boolean flag=true;
        Node pre=null;
        System.out.println(Check(node,pre,flag));

    }

    static boolean Check(Node root ,Node pre,boolean flag){
        if(root!=null) return true;
        Check(root.left,pre,flag);
        if(pre!=null && root.data<=pre.data){
           flag=false;
            return flag;

        }
        pre=root;
        Check(root.right,pre,flag);
        return  true;
    }
}
