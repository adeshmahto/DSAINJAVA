package Stringexamples;
// String buffer and String build
public class TESTING {
    public static void main(String[] args) {

        StringBuffer sbf=new StringBuffer("Adesh Mahto");       // it create only one obj;
        sbf.replace(0,5,"Adity");

        System.out.println(sbf);

    }
}
