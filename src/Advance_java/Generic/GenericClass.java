package Advance_java.Generic;

public class GenericClass <T> {

    T x;
    Object arr[]=new Object[3];

    void setter(T x){
        this.x=x;

    }

    T Getter(){
        return x;
    }

}
