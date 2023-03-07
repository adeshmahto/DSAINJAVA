package Matrix;

import java.util.Arrays;

public class SortRowWise {
    public static void main(String[] args) {

        int [][]arr={
                {9,2,3},
                {6,1,3}

        };

        int temp[]=new int[arr.length*arr[0].length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                temp[k++]=arr[i][j];
            }
        }
        Arrays.sort(temp);
        int r=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=temp[r++];
            }
        }


        System.out.println(arr[0][0]);
    }
}
