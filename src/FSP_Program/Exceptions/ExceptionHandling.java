package FSP_Program.Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i=70,j=0,k;
        System.out.println("start of prog..");
try{
    k=i/j;
    System.out.println(k);
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}


        System.out.println("end of prg..");
    }
}
