package BitManipulation.No;

public class CheckTOconAToB {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int bits=(a^b);
        int count=0;
        while (bits!=0){
            bits=bits &(bits-1);
            count++;
        }
        System.out.println(count);

    }
}
