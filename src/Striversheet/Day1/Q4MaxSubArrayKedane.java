package Striversheet.Day1;

public class Q4MaxSubArrayKedane {
    public static void main(String[] args) {

        int arr[]={10,-3,-4,7};

        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {

         sum+=arr[i];
         if(sum>max){
             max=sum;
         }
         else if(sum<0){
             sum=0;
         }


        }
        System.out.println(max);


    }
}
