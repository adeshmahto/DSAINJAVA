package Access;

import javax.xml.namespace.QName;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    void display(){
        System.out.println(name) ;     // protected accesse modifier
    }


}
