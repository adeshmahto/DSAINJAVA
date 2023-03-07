package Striversheet.Day5;

import LinkedList.Mylinkedlist;

public class RemoveNodeWithoutHead {
    public static void main(String[] args) {
        Mylinkedlist m=new Mylinkedlist();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        Mylinkedlist.Node node=m.head.next;
      Remove(node);
        for(Mylinkedlist.Node t=m.head;t!=null;t=t.next){
            System.out.println(t.data);
        }


    }
    public static  void Remove(Mylinkedlist.Node node){

        Mylinkedlist.Node temp=node.next;
        node.data=temp.data;
        node.next=temp.next;

    }
}
