package searchingandsorting;                                                                import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
       int a[]={1,1,3,1};
       int ma=a[0];
       int count=1;
        for (int i = 1; i <a.length ; i++) {
            if(a[i]==ma) count++;
            else count--;
            if(count==0){
                ma=a[i];
                count=1;
            }

        }
        int c=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==ma)c++;


        }
        if(c>(a.length)/2) System.out.println(ma);
       else System.out.println(-1);






    }
}
