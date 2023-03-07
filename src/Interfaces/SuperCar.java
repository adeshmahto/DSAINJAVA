package Interfaces;

public class SuperCar implements Engine,Braker{

    @Override
    public void brakering() {
        System.out.println("supercar bracke");
    }

    @Override
    public void start() {
        System.out.println("supercar start");
    }

    @Override
    public void stop() {
        System.out.println("supercar stop");
    }

    @Override
    public void acc() {
        System.out.println("supercar accelerate");
    }
}
