package Java8.LambdaExpression;

public class Main {
    public static void main(String[] args) {
// as we know that the we can't create the object of interface anyways
        // here the after th new it creat object of child class of that interface class which is in anonymous in nature
//        MyInter i=new MyInter() {
//            @Override
//            public void sayHello() {
//                System.out.println("hello");
//
//            }
//        };
//
//        MyInter i2 =new MyInter() {
//            @Override
//            public void sayHello() {
//          System.out.println("second anonymous class");
//            }
//        };
//        i.sayHello();


        //lambda
        MyInter i=()->System.out.println("adesh lambda");
        i.sayHello();

        //another lambda
        MySecInter i2=(s)-> s.length();

       System.out.println( i2.SLength("adeshmahto"));


       SumInter i3=(a,b)->a+b;
      int t= i3.sum(2,3);
      System.out.println(t);



    }
}
