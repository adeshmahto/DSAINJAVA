package Striversheet.Day6;

import LinkedList.Mylinkedlist;

import java.util.HashSet;

public class FindCyclicLinkedlist {
    public static void main(String[] args) {

    }
    public static Boolean CheckCyl(Mylinkedlist.Node head){

        Mylinkedlist.Node temp=head;
        HashSet<Mylinkedlist.Node> hash=new HashSet<>();
        while (temp.next!=null){
            if(hash.contains(temp)){
                return true;
            }else{
                hash.add(temp);
            }
            temp=temp.next;

        }
        return false;

    }
    //optimise solution
    public static Boolean checkcyl(Mylinkedlist.Node head){
        Mylinkedlist.Node slow=head;
        Mylinkedlist.Node fast=head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;// 2twice
            slow=slow.next;

            if(fast==slow){
                return  true;
            }
        }
        return  false;
    }
}
