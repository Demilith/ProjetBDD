package src;

import javax.swing.JFrame;
import java.awt.*;



public class Test {

    public static void main(String[] args) {
        //Create and set up the window.
        JFrame frame = new JFrame();
        frame.setTitle("Titre");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Add content to the window.
        frame.add(new find(), BorderLayout.NORTH);
        frame.add(new TabbedPaneDemo(), BorderLayout.CENTER);
        frame.add(new Fenetre(), BorderLayout.WEST);

        //Display the window.
        //frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
       //public static void main(String[] args){
        //Fenetre fenetre = new Fenetre();
        //ImageFrame imagepanel = new ImageFrame();
        //TabbedPaneDemo Tab = new TabbedPaneDemo();
    }


