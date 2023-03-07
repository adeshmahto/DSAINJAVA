package Matrix;

public class Max1sInrowsec {
    public static void main(String[] args) {
        int [][]arr={{0,0},{0,0}};
        int max=0;
        int count=0;
        int final_ans=-1;
        for (int i = 0; i <arr.length ; i++) {


            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    count++;
                }

            }

                if(count>max){
                    final_ans=i;
                    max=count;
                }
        }
        System.out.println(final_ans);

    }
}
