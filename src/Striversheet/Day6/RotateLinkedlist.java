package Striversheet.Day6;

import LinkedList.Mylinkedlist;

public class RotateLinkedlist {
    public static void main(String[] args) {

        Mylinkedlist m=new Mylinkedlist();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);



  Mylinkedlist.Node head=rotate(m.head,2);
        for(Mylinkedlist.Node t=head;t!=null;t=t.next){
            System.out.println(t.data);
        }


    }

   public static Mylinkedlist.Node rotate(Mylinkedlist.Node head,int k){

        if(head==null || head.next==null ||k==0) return head;
        //count len
       int len=1;
       Mylinkedlist.Node cur=head;
       while (cur.next!=null){
           len++;
           cur=cur.next;

       }
       //connect the last note with head so it will be circular linkedlist
       cur.next=head;
       //if k>len
       k=k%len;
       //if k<len
       k=len-k;
       //traverse the linked list k times
       int i=1;
       while (i<=k){
           cur=cur.next;
           i++;
       }
       //make cur.next as head and latest node as null
       Mylinkedlist.Node t=cur.next;
       cur.next=null;
       head=t;

        return  head;
   }
}
