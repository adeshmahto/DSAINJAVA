package Striversheet.Day5;

import LinkedList.Mylinkedlist;

public class AddTwoNumber {
    public static void main(String[] args) {
        Mylinkedlist m=new Mylinkedlist();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);

        Mylinkedlist m2=new Mylinkedlist();
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);


    }
    public static Mylinkedlist.Node AddTwo(Mylinkedlist.Node l1,Mylinkedlist.Node l2){
        Mylinkedlist.Node dummy=new Mylinkedlist.Node(-1);
        Mylinkedlist.Node temp=dummy;
        int carry=0;
        while (l1!=null ||l2!=null|| carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if (l2!=null){
                sum+=l2.data;
                l2=l2.next;

            }
            sum+=carry;
            carry=sum/10;
            Mylinkedlist.Node node=new Mylinkedlist.Node(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;

    }
}
