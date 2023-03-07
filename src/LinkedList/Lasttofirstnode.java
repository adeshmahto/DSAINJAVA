package LinkedList;

public class Lasttofirstnode {
    public static void main(String[] args) {
        Mylinkedlist l2=new Mylinkedlist();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);




        Mylinkedlist.Node h1=l2.head;
        Mylinkedlist.Node nextnode=l2.head.next;
        Mylinkedlist.Node temp=l2.head;

        while (temp.next.next!=null){

            temp=temp.next;
        }
        Mylinkedlist.Node lastnode=temp.next;
        temp.next=h1;
        h1.next=null;
        l2.head=lastnode;
        lastnode.next=nextnode;


        l2.print();


    }

}
