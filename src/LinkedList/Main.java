package LinkedList;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        Mylinkedlist l=new Mylinkedlist();
        l.add(5);
        l.add(2);
        l.add(2);
        l.add(4);
       removedupunsort(l.head);


    }
    public  static void removedupunsort(Mylinkedlist.Node head){
        HashMap<Integer,Integer> hm=new HashMap<>();
        Mylinkedlist.Node curr=head;
        hm.put(curr.data,1);
        Mylinkedlist.Node prev=curr;
        curr=curr.next;
        while (curr!=null){
            if(hm.containsKey(curr.data)){
                prev.next=curr.next;

            }else {
                hm.put(curr.data,1);
                prev=curr;
            }
            curr=prev.next;
        }

        print(head);

    }
   public static void print( Mylinkedlist.Node head) {                 //printing or traversing
    Mylinkedlist.Node temp =head;
        while(temp!=null) {
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }
}
