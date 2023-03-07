package Assignmentfinal.ass3;

public class MyExceptionrunner {
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
