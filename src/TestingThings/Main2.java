package TestingThings;

public class Main2 {
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,5,7};
        for (int i = 0; i <arr.length ; i++) {

            int crrtpos=arr[i]-1;
            // it is correcting the position of the each number
            while ((1<= arr[i] && arr[i]<=arr.length ) && arr[i]!=arr[crrtpos]){       //avoiding -ve value and checking correctposition
                arr[i]=arr[i]^arr[crrtpos];
                arr[crrtpos]=arr[i]^arr[crrtpos];
                arr[i]=arr[i]^arr[crrtpos];
                crrtpos=arr[i]-1;      //now arr[i] has changed and it might need to swip again    // keep the while loop active  and swapping the no. not goes to it correct position
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
