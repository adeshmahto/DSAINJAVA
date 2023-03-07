package Interfaces.Nested;


public class A {
    public interface NesteInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NesteInterface {

    @Override
    public boolean isOdd(int num) {
        return ((num&1)==1);
    }
}
class Main
{
    public static void main(String[] args) {
        B o=new B();
        System.out.println(o.isOdd(2));
    }
}