package Arrays;

public class highestnegfind {
    public static void main(String[] args) {

        int arr[]={-3,-10,-2};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);

    }
}
