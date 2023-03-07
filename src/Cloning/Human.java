package Cloning;

public class Human implements Cloneable {
    int roll;
    String name;
    int arr[];

    public Human(int roll, String name) {
        this.roll = roll;
        this.name = name;
        arr= new int[]{1, 2, 3, 4};
    }
    @Override
    public  Object clone() throws CloneNotSupportedException{
        // shallow copying if you change anything then it will change for every obj in case of primitive only
        //return super.clone();

        Human copy=(Human) super.clone();// shallow copying


        // make a deep copy

        copy.arr=new int[copy.arr.length];
        for(int i=0;i<copy.arr.length;i++){
            copy.arr[i]=this.arr[i];
        }
        return copy;

    }


}
