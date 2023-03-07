package Advance_java.Autoboxing_and_Unboxing;

public class Auto {
    public static void main(String[] args) {
        int i=10;
        //auto-box
        Integer obj=Integer.valueOf(i);


        System.out.println(obj);

        //auto-unbox

        int i1=obj;
        System.out.println(i1);
    }
}
