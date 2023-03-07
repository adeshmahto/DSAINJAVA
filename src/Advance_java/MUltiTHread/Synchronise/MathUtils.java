package Advance_java.MUltiTHread.Synchronise;

public class MathUtils {

   synchronized void getMultiple(int n){   // synchroniezed key word use give control to one thread at a time
        //synchronized
        for (int i = 0; i <=5 ; i++) {
        System.out.println(n*i);
        try{
            Thread.sleep(400);     // current thread pause 400s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
