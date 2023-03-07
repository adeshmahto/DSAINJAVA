package Striversheet.Day2;

public class Q2pascalTrinangle {
    public static void main(String[] args) {

        pascal(6);

    }
    public static void pascal(int n){
        int c=0;
        for (int i = 0; i <n ; i++) {

            //for space creating
            for (int s = n-1; s >=i ; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                if(j==0 || i==0){
                    c=1;
                }else {
                    c=(c*(i-j+1))/j;
                }
                System.out.print(c+" ");

            }
            System.out.println("");

        }
    }
}
