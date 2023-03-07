package Striversheet.Day5;

import LinkedList.Mylinkedlist;

import java.awt.*;

public class ReverseLinkedlist {
    public static void main(String[] args) {

        Mylinkedlist l=new Mylinkedlist();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        Mylinkedlist.Node newHead= ReversR(l.head);
                Mylinkedlist.Node p=null;
        for(p=newHead;p!=null;p=p.next){
            System.out.println(p.data);
        }

    }

    public static Mylinkedlist.Node Revers(Mylinkedlist.Node head){

        Mylinkedlist.Node cur=head;
        Mylinkedlist.Node pre=null;
        while (cur!=null){
            Mylinkedlist.Node temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp; //cur.next
        }
        return pre;

    }
    // recursive approach
    public static Mylinkedlist.Node ReversR(Mylinkedlist.Node head){
        if(head==null || head.next==null) return head;

        Mylinkedlist.Node newHead=ReversR(head.next);
        Mylinkedlist.Node nextHead=head.next;
        nextHead.next=head;
        head.next=null;
        return newHead;
    }


}
