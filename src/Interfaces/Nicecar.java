package Interfaces;

public class Nicecar {

    private  Engine engine;
    public  Nicecar(){
        engine=new car();
    }

    public Nicecar(Engine engine) {
        this.engine = engine;
    }
    public  void dstart(){
        engine.start();
    }
}
