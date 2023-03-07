package Advance_java.Generic;

public class main {
    public static void main(String[] args) {
        GenericClass<String> g= new GenericClass<String>();

        g.setter("adesh");
        System.out.println(g.Getter());
    }
}
