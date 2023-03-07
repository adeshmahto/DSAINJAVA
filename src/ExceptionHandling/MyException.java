package ExceptionHandling;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }


    public static void main(String[] args) {

        try {
            String name="adesh";
            if(name.equals("adesh")){
                throw new MyException("name is adesh");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
