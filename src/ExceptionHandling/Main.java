package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
       try {
           divide(a,b);
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    static  int divide(int a,int b) throws  ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide the no. with zero");
        }
        return a/b;
    }
}
