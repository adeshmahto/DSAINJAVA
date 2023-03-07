package BitManipulation.No;

public class ClearBits {
    public static void main(String[] args) {
        int a=6;                 //110         we want clear 1th bits  ->100 result
        int mask1=1<<1;
        int mask2=~(mask1);
        System.out.println((a&mask2));
    }
}
