package Stringexamples;

public class StringRotation {
    public static void main(String[] args) {
        String s1="ABCD";
        String s2="AC";

    System.out.println(AreRotaional(s1,s2));

    }
    public  static boolean AreRotaional(String s1,String s2){

        if(s1.length()==s2.length()
                && (s1 + s2).indexOf(s2) != -1){
            return true;

        }else
            return false;
    }
}
