package Striversheet.Day6;

import LinkedList.Mylinkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromLinkedList {
    public static void main(String[] args) {
        Mylinkedlist m=new Mylinkedlist();
        m.add(1);
        m.add(0);
        m.add(0);
        m.add(0);
        m.add(1);
      System.out.println(  Palindrome(m.head));

    }


    //brute force approach
    public static Boolean Palindrom(Mylinkedlist.Node head){

        int count=0;
        for(Mylinkedlist.Node t=head;t!=null;t=t.next){
            count++;
        }

        int arr[]=new int[count];
        int i=0;
        for(Mylinkedlist.Node t=head;t!=null;t=t.next) {
            arr[i++] = t.data;
        }

        int temp[]=new int[count];
        for (int j = 0; j <count; j++) {
            temp[j]=arr[j];
        }

        for(int r=0,j=arr.length-1;r<j;r++,j--){
            int t=arr[r];
            arr[r]=arr[j];
            arr[j]=t;
        }
        for (int j = 0; j < count; j++) {

            if(arr[j]!=temp[j]){
                return false;
            }

        }
        return true;

    }
    //optimise approach
    public  static Boolean Palindrome(Mylinkedlist.Node head){
        if(head==null || head.next!=null){
            return true;
        }

        Mylinkedlist.Node slow=head;
        Mylinkedlist.Node fast=head;
        //finding the middle
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        slow.next=reverse(slow.next);
        //move one step
        slow=slow.next;
        while (slow!=null){
            if(head.data!=slow.data){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    public static Mylinkedlist.Node reverse(Mylinkedlist.Node head){

        Mylinkedlist.Node curr=head;
        Mylinkedlist.Node pre=null;
        while (curr!=null){
            Mylinkedlist.Node temp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=temp;
        }
        return pre;
    }
}
