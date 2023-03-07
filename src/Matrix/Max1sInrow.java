package Matrix;

import java.util.HashMap;

public class Max1sInrow {
    public static void main(String[] args) {
        int [][]arr={{0,0},{0,0}};
        HashMap<Integer,Integer> h=new HashMap<>();

       int max=0;
        for (int i = 0; i <arr.length ; i++) {

            int count=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }

            }
                if (count!=max){
                    if(count>max){
                        max=count;
                    }
                    h.put(count,i);
                }



        }
        System.out.println(h.get(max));

    }
}
