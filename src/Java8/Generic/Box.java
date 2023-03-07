package Java8.Generic;

public class Box {
    // object class is top most parent class of all java classes so this object can call other object of classes (Integer ,Double String etc)
    Object container;

    public  Box(Object container){
        this.container=container;
    }
    public  Object getValue(){
        return container;
    }

}
