/**
 * FENETRE
 *
 * La classe FENETRE  est la classe qui permet d'afficher
 *
 * Auteur : Florian Molinie, Benjamin Barillot , Komlagan Tekou
 *          & L'incroyable Matthias Mayol
 *
 * Version : 0.9.0 (26 Février 2018 13h00)
 *
 */
package src;
import src.DtbGestion.Dtbdelete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JPanel {




    public Fenetre() {

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
        BtnCrea.addActionListener(new TraitementBtnCrea());
        Button BtnDelete = new Button("Suppression");
        BtnDelete.addActionListener(new TraitementBtnDelete());
        Button BtnModif = new Button("Modifier");
        BtnModif.addActionListener(new TraitementBtnModif());
        Button BtnConsult = new Button("Consulter");
        BtnConsult.addActionListener(new TraitementBtnConsult());
        //Button BtnSerie = new Button("Série");

        this.add(BtnCrea);
        this.add(BtnDelete);
        this.add(BtnModif);
        this.add(BtnConsult);
        //this.add(BtnSerie);
        this.setVisible(true);


    }


    public class TraitementBtnCrea implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            frame.add(new AddFilmForm().$$$getRootComponent$$$());
            frame.setVisible(true);
            frame.setSize(400, 400);
        }
    }

    public class TraitementBtnDelete implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new Dtbdelete().delete();
        }
    }

        public class TraitementBtnModif implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }

        public  class TraitementBtnConsult implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Consulter().consult();
            }
        }
    }
