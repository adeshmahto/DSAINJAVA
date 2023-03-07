package FSP_Program.Exceptions;

import Assignmentfinal.ass3.MyException;
import Stack.MyStack;

public class MyExcepion extends Exception{

   public MyExcepion(String message){
        super(message);
    }

    public static void main(String[] args) {
        String name="adesh";

        try{
            if(name.equals("adesh")){
                System.out.println("yes name is adesh");
            }else {
                throw new MyException("the name is not adesh");
            }
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}
