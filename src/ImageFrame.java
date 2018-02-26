/**
 * ImageFrame
 *
 * La classe ImageFrame  est la classe qui permet
 * d'afficher la fenetre
 *
 * Auteur : Florian Molinie, Benjamin Barillot , Komlagan Tekou
 *          & L'incroyable Matthias Mayol
 *
 * Version : 0.9.0 (26 Février 2018 13h00)
 *
 */
package src;

import javax.swing.*;

public class ImageFrame {

    public final static int HT = 800;

    public final static int LG = 800;
    public ImageFrame() {

        JFrame F = new JFrame("Une fenetre en Swing");

        F.setSize(HT,LG);

        F.setVisible(true);

        //F.addWindowListener(new gestionFenetre());


        ImageIcon icone = new ImageIcon("src/star.png");

        JLabel image = new JLabel(icone);
        F.add(image);
        F.setVisible(true);

    }

}
/**
class gestionFenetre extends WindowAdapter{

    public void windowClosing(WindowEvent e){

        System.exit(0);

    }

}

**/