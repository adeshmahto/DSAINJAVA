package Oops;



public class Box {


   private double l;
    double b;
    double h;


    Box(){
        super();// object class
        this.b=0;
        this.h=0;
        this.l=0;

    }
    Box(int side){
        System.out.println("parent class contructor");
        this.b=side;
        this.h=side;
        this.l=side;
    }
    Box(Box obj){
        this.l=obj.l;
        this.b=obj.b;
        this.h=obj.h;
    }
    public void display(){
        System.out.println(l+" "+ b+" "+h);


    }


}
