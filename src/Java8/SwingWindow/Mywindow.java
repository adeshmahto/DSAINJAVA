package Java8.SwingWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mywindow {
    public static void main(String[] args) {
        JFrame frame=new JFrame("My Window");

        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        // when you close the windown will exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        //create button
        JButton button=new JButton("Click Me !!");

        //add event listner (Action listner)
        //actionlistner is one methode interface means we can say it functional interface
        //below is Anonymous class
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("CLicked");
//                JOptionPane.showMessageDialog(null,"Hey I am adesh");
//
//            }
//        });

        //using lambda can use to do that also
        button.addActionListener((e)->{System.out.println("hello there");
            JOptionPane.showMessageDialog(null,"Hey I am adesh");
        });



        frame.add(button);
        frame.setVisible(true);
    }
}
