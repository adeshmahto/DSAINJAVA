package Advance_java.InputandOutputstream;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream i=null;
        FileOutputStream o=null;
        try{
            i=new FileInputStream("source.txt");
            o=new FileOutputStream("destinaion.txt");

            // reads a byte at a time, if it reached end of the file ,return-1;
            int content;
            while ((content= i.read())!=-1){
                o.write((byte)content);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (i!=null){
                i.close();
            }
            if(o!=null){
                o.close();
            }
        }
    }
}
