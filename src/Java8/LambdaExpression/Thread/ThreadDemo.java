package Java8.LambdaExpression.Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        //first thread
        //name of the thread is adesh
        Runnable thread1=()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t=new Thread(thread1);
        t.setName("adesh");
        t.start();


        Runnable thread2=()->{
            for (int i = 1; i <=10 ; i++) {
                System.out.println("2"+"X"+i+"="+(2*i));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };

        Thread t2=new Thread(thread2);
        t2.setName("adesh2");
        t2.start();

    }
}
