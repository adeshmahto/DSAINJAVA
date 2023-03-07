package AccentureCompany;

public class Q5 {
    public static void main(String[] args) {

        System.out.println(fun(4,20));
    }
    public static int fun(int n,int m){

        int div4=0;
        int divnot4=0;
        for (int i = 1; i <=m ; i++) {

            if(i%n==0){
                div4+=i;
            }else {
                divnot4+=i;
            }

        }
        return divnot4-div4;
    }
}
