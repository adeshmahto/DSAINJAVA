package AlgorithmsDAA;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanCode {

    public static void main(String[] args) {

        int n=5;
        char ch[]=new char[]{'a','b','c','d','e'};
        int [] freq=new int[]{5,9,12,13,16,45};
      PriorityQueue<HuffNode>q=new PriorityQueue<>(n,new MyComparator());
        for (int i = 0; i <n ; i++) {

            HuffNode node= new HuffNode();
            node.data=freq[i];
            node.c=ch[i];
            node.left=null;
            node.right=null;
            q.add(node);

        }
       //create a pointer root
        HuffNode root=null;
        while (q.size()>1){
            HuffNode x=q.peek();
            q.poll();
            HuffNode y=q.peek();
            q.poll();
            HuffNode tree=new HuffNode();
            tree.data=x.data+y.data;
            tree.c='-';
            tree.left=x;
            tree.right=y;
            root=tree;
            q.add(tree);
        }

        //print
        PrintCode(root," ");

    }
    public static  void PrintCode(HuffNode root,String s){
        if(root.left==null && root.right==null && Character.isLetter(root.c)){
            System.out.println(root.c+" "+s);
            return;
        }
        PrintCode(root.left,s+"0");
        PrintCode(root.right,s+"1");

    }
}

class HuffNode{
    int data;
    char c;
    HuffNode left;
    HuffNode right;

}
class MyComparator implements Comparator<HuffNode>{
    @Override
    public int compare(HuffNode o1, HuffNode o2) {
        return o1.data-o2.data;
    }
}
