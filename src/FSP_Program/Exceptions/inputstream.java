package FSP_Program.Exceptions;

import java.io.FileInputStream;

public class inputstream {
    public static void main(String[] args) {
        byte[] b=new byte[10];
        try{
            FileInputStream fis=new FileInputStream("d:\\a.txt");   // input means taking the or extract the value
            fis.read(b,0,10);
            String s=new String(b,0);
            System.out.println(s);
        }catch (Exception e){
            System.out.println("error"+e.toString());
        }
    }
}
