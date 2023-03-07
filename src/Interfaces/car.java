package Interfaces;

public  class car implements Engine,Media{

    @Override
    public void start() {
        System.out.println("car start");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }

    @Override
    public void acc() {
        System.out.println("car accelerate");
    }

    @Override
    public void brakering() {
        System.out.println("car applied brack");
    }
}
