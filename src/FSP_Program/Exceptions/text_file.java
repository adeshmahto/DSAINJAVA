package FSP_Program.Exceptions;

import java.io.FileOutputStream;

public class text_file {
    public static void main(String[] args) {
        byte buff[]=new byte[100];
        try{
            System.out.println("enter som text");
            System.in.read(buff,0,100);
        }catch (Exception e){
            System.out.println("error"+ e.toString());

        }
        try{
            FileOutputStream i=new FileOutputStream("testing1.txt");
            i.write(buff);
        }catch (Exception ae){
            System.out.println(ae.toString());
        }


    }
}
