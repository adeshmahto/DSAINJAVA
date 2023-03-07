package Generic.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students adesh=new Students(2,85.6f);
        Students ankit=new Students(3,97.9f);
        Students adity=new Students(4,98.9f);
        Students aryan=new Students(0,90.9f);

       Students[] list={adesh,ankit,adity,aryan};
        Arrays.sort(list);  // it sortig the object because of we have created the compareto Method


        for (int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
}
