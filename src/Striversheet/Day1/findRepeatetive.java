package Striversheet.Day1;

public class findRepeatetive {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,6,6};
        for (int i = 0; (i <arr.length); i++) {
            if(arr[Math.abs(arr[i])-1]>=0){
                arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];

            }else {
                System.out.println("repeatetive ith->"+ Math.abs(arr[i]));
            }

        }
    }
}
