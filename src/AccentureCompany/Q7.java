package AccentureCompany;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(fun(9,new int[]{5, 2, 4 ,3, 9 ,7 ,1}));

    }
    public  static int fun(int sum,int arr[]){

        if(arr.length==0){
            return -1;
        }

        Arrays.sort(arr);
        if(arr[0]+arr[1]<=sum){
            return arr[0]*arr[1];
        }
        else {
            return 0;
        }
    }
}
