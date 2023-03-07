package Stack;

class DLLNode{
    DLLNode pre;
    DLLNode next;
    int data;
    DLLNode(int data){this.data=data;pre=null;next=null;};
}
public class MyStack {
    DLLNode mid;
    DLLNode head;
    int size=0;
    void push(int data){
        DLLNode newNode=new DLLNode(data);
        if(size==0){
            head=newNode;
            mid=newNode;
            size++;
            return;
        }
        head.next=newNode;
        newNode.pre=head;
        head=head.next;
        if(size % 2!=0){
            mid=mid.next;
        }
        size++;
    }
    int pop(){
        int data=-1;
        if(size==0){
            System.out.println("stack is empty");
        }
        if(size!=0){
            if(size==1){
                data=head.data;
                head=null;
                mid=null;
                return data;
            }
            else{
                data=head.data;
                head.pre=head;
                head.next=null;
                if(size%2==0){
                    mid=mid.pre;
                }
            }
            size--;
        }
        return data;
    }
    // Function for finding middle of the stack
    int findMiddle()
    {
        if (size == 0) {
            System.out.println("Stack is empty now");
            return -1;
        }
        return mid.data;
    }
    void deleteMiddleElement()
    {
        // This function will not only delete the middle
        // element
        // but also update the mid in case of even and
        // odd number of Elements
        // when the size is even then findmiddle() will show the
        // second middle element as mentioned in the problem
        // statement
        if (size != 0) {
            if (size == 1) {
                head = null;
                mid = null;
            }
            else if (size == 2) {
                head = head.pre;
                mid = mid.pre;
                head.next = null;
            }
            else {
                mid.next.pre = mid.pre;
                mid.pre.next = mid.next;
                if (size % 2 == 0) {
                    mid = mid.pre;
                }
                else {
                    mid = mid.next;
                }
            }
            size--;
        }
    }
}
