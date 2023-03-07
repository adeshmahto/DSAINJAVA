package LinkedList;


import java.util.Comparator;

public class Mylinkedlist {
  public  Node head;
    public void add(int data) {                 // add the numbers
        Node toAdd= new Node(data);
        if(isEmpty()) {
            head=toAdd;               // in first head is null so that why we add another node
            return;
        }

        Node temp =head;
        while(temp.next!=null) {
            temp=temp.next;                   //linking or shifting next node
        }
        temp.next=toAdd; // new node attached;


    }

    //comparator
    public static class StockComparator implements Comparator<Node> {
        @Override
        public int compare(Node o1, Node o2) {
            if(o1.data>o2.data){
                return 1;
            }else if(o1.data==o2.data){
                return 0;
            }else {
                return -1;
            }
        }

        // override the compare() method



    }
    public void lenght() {
        Node p;
        int count=0;
        for(p=head;p!=null;p=p.next) {
            count++;
        }
        System.out.println(count);
    }

   public void addStart(int data) {                   // adding from start
        Node toAddStart= new Node(data);
//        toAddStart.data=data;
//        toAddStart.next=null;


        toAddStart.next=head;          // it point again head then head pointing to the new node or adding the new node;
        head=toAddStart;
    }


    public void addAt(int index,int data) {
        Node toAddAt= new Node(data);
        toAddAt.data=data;
        toAddAt.next=null;

        if(index==0)  {    addStart(data);     }

        else {
            Node temp=head;                                    // now temp is head,
            for(int i=0;i<index-1;i++) {
                temp=temp.next;                               // temp is storing 1st node
            }
            toAddAt.next= temp.next;                          // new node is storing or pointing  temp.next(2nd node)

            temp.next=toAddAt;  }                              // in 2nd node position has the value of new node


    }

   public void print() {                 //printing or traversing
        Node temp =head;
        while(temp!=null) {
            System.out.println(temp.data +" ");
            temp=temp.next;
        }
    }

   public void adjdelete() {              //alternate delete

        if (head == null)
            return;
        Node tn = head;
        Node pn = head;
        int count = 1;
        while(tn.next != null) {
            count++;
            pn = tn;
            tn = tn.next;
            if(count % 2 == 0)
                pn.next = tn.next;

        }

        Node nn = head;
        while(nn != null) {
            System.out.print(nn.data + " ");
            nn = nn.next;
        }
    }
    public void deletpn(int n) {       // particular number delete
        Node temp=head;
        Node n1=null;
        while(temp.next.data!=n) {
            temp=temp.next;

        }n1=temp.next;
        temp.next=n1.next;


    }
    public void addlast(int data) {
        Node toAddend= new Node(data);
        toAddend.data=data;
        toAddend.next=null;
        Node temp=head;
        while(temp.next!=null) {
            temp=temp.next;
        }
        temp.next=toAddend;
        toAddend.next=null;
    }




    public void deleteAt(int index) {               // delete an element;
        if(index==0) {
            head=head.next;                 // delete the first element;
        }
        else {
            Node temp=head;
            Node n1=null;

            for(int i=0;i<index-1;i++) {
                temp=temp.next;

            }
            n1=temp.next;
            temp.next=n1.next;


        }
    }
    public void deletlast() {

        Node temp=head;

        while(temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }

    public void rearrange() {

        Node p;
        Node g;
        int  temp;
        if(head==null|| head.next==null) return;
        p=head;
        g=head.next;
        while(g!=null) {
            temp=p.data;
            p.data=g.data;
            g.data=temp;
            p=g.next;

            if(p!=null) {
                g=p.next;
            }else {
                g=null;
            }}

    }
    public void Moveltof() {                       // move last element to the first position
        Node p,q;
        if((head==null)||(head.next==null)) return;
        q=null;p=head;
        while(p.next!=null) {
            q=p;
            p=p.next;
        }

        p.next=head;
        head=p;
        q.next=null;

    }
    public void sort() {               // sorting the linked list (bubble  sort );

        Node g;
        int  temp;
        if(head==null|| head.next==null) return;
        Node p;

        for(p=head;p.next!=null;p=p.next) {

            for(g=head;g.next!=null;g=g.next) {

                if(g.data>g.next.data) {
                    temp=g.data;
                    g.data=g.next.data;
                    g.next.data=temp;
                }
            }


        }

    }
    public void removeduplicate(Node head){
        Node temp=head;
        if(head==null && head.next==null) System.out.println(head.data);
        while (temp!=null && temp.next!=null){
            if(temp.data== temp.next.data){
                Node t=temp.next;
                temp.next=t.next;
            }else {
                temp=temp.next;
            }
        }

    }


    public void rev(Node pre, Node cur) {

        if(cur!=null) {
            rev(cur,cur.next);

            cur.next=pre;
        }
        else {
            head=pre;
        }

    }
    public void rev2(Node p) {

        if(p!=null) {
            rev2(p.next);
            System.out.println(p.data);
        }
    }
    public void reorder() {

        Node t=head;
        Node p=head;
        Node g=null;
        while(p.next!=null) {
            g=p;
            p=p.next;
        }
        p.next=t.next;// p last node;
        t.next=p;
        g.next=null;// 2nd last node,
        Node n=head;

        while(n.next.next!=null) {
            n=n.next;
        }
        if(n.data<n.next.data) {
            n.data=n.data^n.next.data;
            n.next.data=n.data^n.next.data;
            n.data=n.data^n.next.data;
        }


    }



    boolean isEmpty() {                              //find list  is empty or not
        if(head==null) {
            return true;
        }else {
            return false;
        }
    }


    public static class Node{
       public int data;                                  // structure for c or for java it is class
     public  Node next;


        public Node(int data) {                   //data entering// constructor
            this.data=data;
            next=null;
        }
    }



}

