package BitManipulation.No;

public class SetTheBits {
    public static void main(String[] args) {
        int a=6;            //110
        int mask=1<<0;
        int n=a|mask;        // setting the bits in 0th place and or it ->111 which is 7;
        System.out.println(n);
    }
}
