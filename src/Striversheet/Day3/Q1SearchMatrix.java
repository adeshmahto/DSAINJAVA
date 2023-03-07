package Striversheet.Day3;

public class Q1SearchMatrix {
    public static void main(String[] args) {
      int [][]  matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

      int target=16;
      int row=0;
        for (int i = 0; i <matrix.length ; i++) {
            if(matrix[i][0]<=target ){
               row=i;

            }

        }
        for (int i = 0; i <matrix[0].length ; i++) {
            if(matrix[row][i]==target){
                System.out.println(matrix[row][i]);
            }

        }


    }
}
