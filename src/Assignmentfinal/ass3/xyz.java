package Assignmentfinal.ass3;

public class xyz {
    static int arr[]=new int[5];
    void Insert(int index,int value) {
        try {
            arr[index]=value;
        }catch (Exception e){
            System.out.println(e);
        }
    }
    void displayarr(){
        for (int e:arr) {
            System.out.println(e);
        }
    }

}
