package Advance_java.MUltiTHread;

public class ThreadingDemo {
    public static void main(String[] args) {

        int n=10;
        for (int i = 0; i < n; i++) {

            Thread1 t1=new Thread1();
            t1.start();        // running

//           Thread t2=new Thread(new Thread2());
//           t2.start();
            //same as
            Thread2 t2 =new Thread2();
            t2.run();




        }

        //output is coming not in sequence
        //because of Concurrency means thread always run in parallel not in sequence
    }
}
