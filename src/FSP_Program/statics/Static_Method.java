package FSP_Program.statics;

public class Static_Method {

    static int age=10,b;// b is zero right now


    static {    // it always execute first even before main method


        System.out.println("enter the block");
         b=20;
        System.out.println("quit static block.");
    }


    public static void main(String[] args) {

//        Static_Method s=new Static_Method();
//        s.mymethod();

        System.out.println("start");
        System.out.println("age"+age);
        System.out.println(b);
        System.out.println("end");



    }
     void mymethod(){
        System.out.println("my method");
    }
}
