package Striversheet.Day5;

import LinkedList.Mylinkedlist;
import Stack.MyStack;

public class DeleteNthNodeLast {
    public static void main(String[] args) {

        Mylinkedlist m=new Mylinkedlist();
        m.add(1);
        m.add(2);


       Mylinkedlist.Node head=  DeleteNodeN(m.head,2);
       for(Mylinkedlist.Node t=head;t!=null;t=t.next){
           System.out.println(t.data);
       }

    }
    public static Mylinkedlist.Node DeleteNode(Mylinkedlist.Node head,int n){

        if(head==null || head.next==null){
            return null;
        }

        Mylinkedlist.Node temp;
        int count=0;
        for(temp=head;temp!=null;temp=temp.next){
            count++;

        }

        Mylinkedlist.Node node=head;
        int m=count-n;
        int i=0;

        if(m==0){
            head=head.next;
            return head;
        }
        while (i<m-1){

            node=node.next;
            i++;

        }
        Mylinkedlist.Node t=node.next;
        node.next=t.next;



        return  head;

    }

    public static Mylinkedlist.Node DeleteNodeN(Mylinkedlist.Node head,int n){

        Mylinkedlist.Node dummy=new Mylinkedlist.Node(-1);

        dummy.next=head;
        Mylinkedlist.Node fast=dummy;
        Mylinkedlist.Node slow=dummy;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;

    }
}
