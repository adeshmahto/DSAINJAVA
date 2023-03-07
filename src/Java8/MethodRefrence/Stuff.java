package Java8.MethodRefrence;

import Assignment5.Assingnmentb.SubSubHuman;

public class Stuff {
    public static void DoStuff(){
        System.out.println("doing");
    }

    public static void threadTask() throws InterruptedException {
        for (int i = 0; i <=10 ; i++) {

            System.out.println(i*2);
            Thread.sleep(1000);

        }
    }

    public static void adesh(){
        System.out.println("adesh");
    }
}
