package TestingThings;

import java.util.ArrayList;
import java.util.Arrays;

public class Node {
    public static void main(String[] args) {

    int x=3;
    int y=4;
    sorting(x,y);
    System.out.println(x);

    }

    private static void sorting(int x,int y) {
        int temp=x;
        x=y;
        y=temp;
    }


}

