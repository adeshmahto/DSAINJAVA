package Advance_java.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image {
    public static void main(String[] args) {
        int width=963;
        int height=640;

        BufferedImage image=null;

        image=readFromFile(width,height,image);
        writeToFile(image);
    }

    private static void writeToFile(BufferedImage image) {
        try{
            File output=new File("C:\\Desktop");
            ImageIO.write(image,"jpg",output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image) {

        try{
            File sampleFile=new File("C:\\Users\\91756\\Desktop\\DownloadImage");
            image=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);

            //reading
            image= ImageIO.read(sampleFile);
            System.out.println("Reading complete"+image);
        } catch (IOException e) {
           System.out.println(e);
        }
        return image;

    }
}
