package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;


public class find extends JPanel {

    private static JLabel image;

    public find() {
        /**
        GridLayout gl = new GridLayout(1, 10);
        gl.setHgap(5); //Cinq pixels d'espace entre les colonnes (H comme Horizontal)
        gl.setVgap(5); //Cinq pixels d'espace entre les lignes (V comme Vertical)
        //Ou en abrégé : GridLayout gl = new GridLayout(3, 2, 5, 5);
         **/
        BorderLayout gl = new BorderLayout();
        this.setLayout(gl);

        //ImageIcon icone = new ImageIcon("src/download.jpg");
        //ImageIcon icone2 = new ImageIcon("src/book.png");
        image = new JLabel();

        JLabel recherche = new JLabel("Nom super classe de la Solution");
        //recherche.setDisplayedMnemonic(KeyEvent.VK_U);


        this.add(recherche, BorderLayout.CENTER);

        ImageIcon icone = new ImageIcon("src/Ressources/star.png");
        JLabel image = new JLabel(icone);
        this.add(image, BorderLayout.WEST);
        this.setVisible(true);



    }
    public static void setImage(ImageIcon Icone){
        image.setIcon(Icone);
    }
}
