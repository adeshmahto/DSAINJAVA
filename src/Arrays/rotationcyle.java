package Arrays;

public class rotationcyle {
    public static void main(String[] args) {
        int arr[]={9, 8, 7, 6, 4, 2, 1, 3};

        //first method
//        int j=0;
//        int brr[]=new int[arr.length];
//
//        for (int i = 1; i <arr.length ; i++) {
//           brr[i]=arr[j++];
//        }
//        brr[0]=arr[arr.length-1];
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(brr[i]);
//        }
 rotated(arr,arr.length);

    }
    //second method
    public  static void rotated(int arr[],int n ){
        int i=0,j=n-1;

        while (i!=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }

    }
}
