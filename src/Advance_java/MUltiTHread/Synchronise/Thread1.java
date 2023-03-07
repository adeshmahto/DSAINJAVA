package Advance_java.MUltiTHread.Synchronise;

public class Thread1 extends Thread{
    MathUtils mu;
    public Thread1(MathUtils mu){
        this.mu=mu;
    }
    @Override
    public  void run(){
        try{
            mu.getMultiple(2);     // method call
        }catch (Exception e){
            System.out.println("Exception raised"+e);
        }
    }
}
