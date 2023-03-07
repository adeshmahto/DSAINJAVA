package Matrix;

import static Matrix.LargestAreahistogram.LargestArea;

public class RectangleInMatrix {
    public static void main(String[] args) {
        int arr[][]={
                    {1,1,1,1,1},
                    {0,1,0,0,0},
                   };

        int height[]=new int[arr[0].length];

        for (int i = 0; i < arr[0].length; i++) {            // for 1st row only
            height[i]=arr[0][i];

        }
        int area=LargestArea(height);        // fromhistogramquestion
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==1){
                    height[j]++;
                }else {
                    height[j]=0;
                }

            }
            area=Math.max(area,LargestArea(height));
        }
        System.out.println(area);


    }
}
