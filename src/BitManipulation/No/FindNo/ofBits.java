package BitManipulation.No.FindNo;

public class ofBits {
    public static void main(String[] args) {
        int a=13;
        int n=a;
        int count=0;
        while (n!=0){
            n=n>>1;
            count++;
        }

        System.out.println(count);

        // second method  // it will give the no. of bits (1)
        int cnt=0;
        while (a!=0){
            a=a&(a-1);
            cnt++;

        }
        System.out.println(cnt);
    }
}
