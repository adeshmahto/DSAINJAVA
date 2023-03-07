package BitManipulation.No;

import java.util.HashSet;

public class Nonrepeating {
    public static void main(String[] args) {

        int arr[]={1,2,2,3,4,1};
        for(int i=0;i<arr.length;i++){
            int j;
            for( j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]) break;
            }
            if(j==arr.length){
                System.out.println(arr[i]);
            }

        }



    }
}
