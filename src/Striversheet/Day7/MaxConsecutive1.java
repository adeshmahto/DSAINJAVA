package Striversheet.Day7;

public class MaxConsecutive1 {
    public static void main(String[] args) {

        System.out.println(consecutive(new int[] {1,0,1,1,0,1}));
    }
    public static int consecutive(int arr[]){

        int count=0;
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==1){
                count++;
            }else {
                count=0;
            }

            if(count>max){
                max=count;
            }
        }
        return max;
    }
}
