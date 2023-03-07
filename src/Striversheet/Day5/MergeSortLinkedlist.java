package Striversheet.Day5;

import LinkedList.Mylinkedlist;

public class MergeSortLinkedlist {
    public static void main(String[] args) {
        Mylinkedlist l1=new Mylinkedlist();
        l1.add(1);
        l1.add(2);
        l1.add(4);

        Mylinkedlist l2=new Mylinkedlist();
        l2.add(1);
        l2.add(3);
        l2.add(4);

        Mylinkedlist.Node h1=l1.head;
        Mylinkedlist.Node h2=l2.head;

        merge(h1,h2);










    }

    public  static Mylinkedlist.Node merge(Mylinkedlist.Node list1,Mylinkedlist.Node list2){

        Mylinkedlist.Node h1=list1;
        Mylinkedlist.Node h2=list2;
        Mylinkedlist.Node dummy=new Mylinkedlist.Node(0); // new head
        Mylinkedlist.Node temp=dummy;   // pointer to the head

        while (h1!=null && h2!=null){
            if(h1.data<h2.data){
                temp.next=h1;
                temp=temp.next;
                h1=h1.next;
                temp.next=null;
            }else {
                temp.next=h2;
                temp=temp.next;
                h2=h2.next;
                temp.next=null;
            }

        }
        if(h1!=null){
            temp.next=h1;
        }
        if(h2!=null){
            temp.next=h2;
        }
        return  dummy.next;

    }
}
