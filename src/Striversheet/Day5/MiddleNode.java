package Striversheet.Day5;

import LinkedList.Mylinkedlist;

public class MiddleNode {
    public static void main(String[] args) {
        Mylinkedlist l=new Mylinkedlist();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);


       System.out.println(middle(l.head).data);





    }

    public  static Mylinkedlist.Node middle(Mylinkedlist.Node head){
        Mylinkedlist.Node p=null;
        int count=0;
        for(p=head;p!=null;p=p.next) {
            count++;
        }
        int mid=count/2;
        int i=0;
        Mylinkedlist.Node t;
        t=head;
        while (i<mid && t.next!=null){
            i++;
            t=t.next;
        }
       return t;


    }
}
