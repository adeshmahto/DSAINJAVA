package LambdaExpression;

import java.util.ArrayList;

public class lambdaExpression {
    public static void main(String[] args) {

        Operation o=(a,b)->a*b;
        System.out.println(operater(2,3,o));

    }
   public static int operater(int a,int b,Operation op){
        return op.operation(a,b);
    }
}

interface Operation{

 int operation(int a,int b);;
}
