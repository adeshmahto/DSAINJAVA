package Striversheet.Day6;

import LinkedList.Mylinkedlist;

public class ReversKthelementinLinkedlist {
    public static void main(String[] args) {
        Mylinkedlist m=new Mylinkedlist();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
       Mylinkedlist.Node h=ReverseKth(m.head,3);
       Mylinkedlist.Node temp;
       for(temp=h;temp!=null;temp=temp.next){
           System.out.println(temp.data);
       }

    }
    public static Mylinkedlist.Node ReverseKth(Mylinkedlist.Node head,int k){


        if(head==null || k==1) return  head;
        Mylinkedlist.Node dummy=new Mylinkedlist.Node(0);
        dummy.next=head;
        Mylinkedlist.Node cur=dummy,nex=dummy,pre=dummy;
        int count=0;
        while (cur.next!=null){
            cur=cur.next;                //it will goes to kth node
            count++;
        }
        while (count>=k){
            cur=pre.next;    // first node
            nex=cur.next;    // kth node
            for (int i = 1; i <k ; i++) {   //  k-1  node time it will run
                cur.next=nex.next;
                pre.next=nex;
                nex=cur.next;


            }
            pre=cur;
            count-=k;  // count will reinitiliase to 0;
        }
        return dummy.next;

    }
}
