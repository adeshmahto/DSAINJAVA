package Arrays;

public class kadansAlgorithm {
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        System.out.println(kadane(arr));

        // if all the number is -ve the you have to return the lowest -ve value

    }
    public static  int kadane(int arr[]){
        int curr_sum=0;
        int max_sum=0;
        for (int i = 0; i <arr.length ; i++) {

            curr_sum+=arr[i];
            if(curr_sum>max_sum){
                max_sum=curr_sum;
            }
            else if(curr_sum<0) {
                curr_sum=0;
            }

        }
        return max_sum;
    }
}
