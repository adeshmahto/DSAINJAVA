package Striversheet.Day7;

import LinkedList.Mylinkedlist;

public class CopyLInkedlistWithRandomPointer {
    public static void main(String[] args) {

    }
    //1-2-3-4-5
    //Node{
    //int val;
    // node random;
    //node next;
    //}

    public static Mylinkedlist.Node CopyLL(Mylinkedlist.Node head){
        Mylinkedlist.Node cur=head;
        while (cur!=null){
            Mylinkedlist.Node temp=cur.next;
            cur.next=new Mylinkedlist.Node(cur.data);     //create a new node with cur value of copied value 1->1 like this
            cur.next.next=temp;                      // after copied 1->2       temp=2;
            cur=temp;                              // pointer move to the 2 node in orginal list
        }
        cur=head;
        //setting the random pointer  in  the copied list
//        while(cur!=null){
//            if(cur.next!=null){
//                cur.next.random=cur.random!=null?cur.random.next:null;     //1->1  random pointer of 1->2->2  so copied 1 connect with the copied 2
//            }cur=cur.net.net;
//        }

        Mylinkedlist.Node org=head,copy=head.next;
        Mylinkedlist.Node temp=copy;    // we have return the copied linked list
        while(org!=null){
            org.next=org.next.next;
            copy.next=copy.next.next;
            org=org.next;
            copy=copy.next;
        }
        return temp;



    }
}
