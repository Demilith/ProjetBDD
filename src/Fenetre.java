package src;

import java.awt.GridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JPanel implements ActionListener{
    public Fenetre(){

        GridLayout gl = new GridLayout(6, 1);
        gl.setHgap(5); //Cinq pixels d'espace entre les colonnes (H comme Horizontal)
        gl.setVgap(5); //Cinq pixels d'espace entre les lignes (V comme Vertical)
        //Ou en abrégé : GridLayout gl = new GridLayout(3, 2, 5, 5);
        this.setLayout(gl);
       // this.setTitle("Bouton");
        this.setSize(150, 300);
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // this.setLocationRelativeTo(null);
        //On définit le layout à utiliser sur le content pane
        //Trois lignes sur deux colonnes
        //On ajoute le bouton au content pane de la JFrame

        Button BtnCrea = new Button("Création");
            BtnCrea.addActionListener(this);
        Button BtnDelete = new Button("Suppression");
        Button BtnModif = new Button("Modifier");
        Button BtnConsult = new Button("Consulter");
        //Button BtnSerie = new Button("Série");

        this.add(BtnCrea);
        this.add(BtnDelete);
        this.add(BtnModif);
        this.add(BtnConsult);
        //this.add(BtnSerie);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame();
        frame.add(new AddFilmForm().$$$getRootComponent$$$());
        frame.setVisible(true);
        frame.setSize(400, 400);
    }
}