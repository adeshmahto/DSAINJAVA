package Striversheet.Day6;

import LinkedList.Mylinkedlist;
import LinkedList.Mylinkedlist.StockComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class FlatteringLinkedList {
    public static void main(String[] args) {

       Mylinkedlist m=new Mylinkedlist();
       m.add(45);
       m.add(3);
       m.add(13);

  ArrayList<Mylinkedlist.Node> set=new ArrayList<Mylinkedlist.Node>();
       Mylinkedlist.Node t=m.head;
       for(t=m.head;t!=null;t=t.next){
           set.add(t);
       }

        Collections.sort(set, new StockComparator());
//       set.stream().forEach(e->{System.out.println(e.data);});



 Mylinkedlist.Node node=new Mylinkedlist.Node(0);
        Mylinkedlist.Node head=node;
       int i=0;
       while (i<set.size()){
           Mylinkedlist.Node dummy=new Mylinkedlist.Node(set.get(i++).data);
           head.next=dummy;
           head=head.next;

       }






    }
}
