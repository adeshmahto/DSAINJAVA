package Striversheet.Day3;

public class Pow {
    public static void main(String[] args) {

        double x=2000.0 ;
        long n=-2147483648;
        if(n<0){
            long temp=-n;
            double result=1/pow(x,temp);
            System.out.println(result);
        }


    }
    public static Double pow(Double x,long n){
        if(n==0){
            return 1.0;
        }
        Double output=1.00000;
        while (n>0){
            if((n&1)==0){     // if even
                x=x*x;
                n=n/2;
            }
            else {
                output=output*x;
                n=n-1;

            }
        }
        return output;
    }


}
