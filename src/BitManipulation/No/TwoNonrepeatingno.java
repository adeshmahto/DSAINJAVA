package BitManipulation.No;

import java.util.ArrayList;

public class TwoNonrepeatingno {
    public static void main(String[] args) {
        int arr[]={1,1 ,2,3,4,4};
        int xor=0;
        for(int e:arr){
            xor=xor^e;
        }
        System.out.println();
        // find the rigt most bit

        int rmb= xor&-xor;        // masking also can used here 1<<1 then xor & mask


        int x=0;
        int y=0;
        for(int val:arr){
            if((val & rmb)==0){
                x=x^val;
            }else {
                y=y^val;
            }
        }
        if(x<y){
            System.out.println(x);
            System.out.println(y);

        }else {
            System.out.println(x);
            System.out.println(y);
        }







    }
}