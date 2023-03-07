package Java8.Generic;

public class Demo {
    public static void main(String[] args) {
        Box b=new Box("adesh");
        //so object class is not type safe

      System.out.println( b.getValue());

      Box2<String>b2=new Box2<>();
      b2.container="adesh";
      b2.getvalue();
    }
}
