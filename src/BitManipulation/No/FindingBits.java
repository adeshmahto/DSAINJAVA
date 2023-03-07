package BitManipulation.No;

public class FindingBits {
    public static void main(String[] args) {
        int a=6;
        int mask=1<<2;
       if((a&mask)==0){
           System.out.println("it has zero bit in 2nd place");
       }
       else {
           System.out.println("it has one bit in 2nd place");
       }
    }
}
