package BitManipulation.No;

public class NonRepeatinusingXor {
    public static void main(String[] args) {

        int arr[]={9,2,3,3,2};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }

        System.out.println(xor);



    }
}
