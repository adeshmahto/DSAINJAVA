package Assignmen2;

public class Child implements Parent1,Parent2,Parent3{
    @Override
    public void walking(){

        System.out.println("walking..........");
    }

    @Override
    public void running() {
        System.out.println("running.......");
    }
    @Override
    public void thinking(){
        System.out.println("thinking.......");
    }
}
