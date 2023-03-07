package AccentureCompany;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {

        fun(new int[]{3 ,2 ,1, 7 ,5 ,4});
    }
    public static int fun(int arr[]){

        int max[]=new int[arr.length];
        int min[]=new int[arr.length];
        int ans1=0;
        int ans2=0;
        int k=0;
        int x=0;
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==0){
                max[k++]=arr[i];
            }else {
                min[x++]=arr[i];
            }
        }
      //bubble sor acending order
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length-i-1 ; j++) {
                if(max[j]<max[j+1]){
                    max[j]=max[j]^max[j+1];
                    max[j+1]=max[j]^max[j+1];
                    max[j]=max[j]^max[j+1];

                }


            }

        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length-i-1 ; j++) {
                if(min[j]>min[j+1]){
                    max[j]=max[j]^max[j+1];
                    max[j+1]=max[j]^max[j+1];
                    max[j]=max[j]^max[j+1];

                }


            }

        }

        System.out.println(max[1]+min[1]);
        return 1;



    }
}
