package Oops;

public class BoxWeight extends  Box{
    double weight;
    public BoxWeight(){
        weight=0;
    }

    public BoxWeight(int side, double weight) {

        super(side);
        System.out.println("child class constructor ");
        this.weight = weight;

    }
    BoxWeight(BoxWeight old){
        super(old);                // it call the copycontructor of Box class
        weight=old.weight;
    }
}
