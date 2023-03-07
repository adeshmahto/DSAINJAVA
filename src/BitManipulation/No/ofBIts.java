package BitManipulation.No;

public class ofBIts {
    public static void main(String[] args) {

//        int n=6;
//        int count=0;
//        while (n>0){
//            int r=n%2;
//            if(r==1){
//                count++;
//            }
//
//            n=n/2;
//        }
//        System.out.println(count);

        // another methode

        int n=6;
        int cnt=0;
        while (n!=0){
            cnt++;
            n=n&(n-1);
        }
        System.out.println(cnt);

    }
}
