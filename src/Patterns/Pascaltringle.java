package Patterns;

public class Pascaltringle {

    public static void main(String[] args) {


//	       1
//	      1 1
//	     1 2 1
//	    1 3 3 1
//	   1 4 6 4 1
//	  1 5 10 10 5 1

        pascalt(6);



    }
    public static void pascalt(int n) {
        int c=0;

        for(int i=0 ;i<n;i++) {             //i= 0,1,2,3

            for(int s=n-1;s>=i;s--) {

                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {   //j=0,1,2

                if(j==0 || i==0) {
                    c=1;
                }
                else {
                    c=(c*(i-j+1))/j;
                }
                System.out.print(c+" ");
            }
            System.out.println("\n");
        }

    }
}
