/**
 * FENETRE
 *
 * La classe FENETRE  est la classe qui permet d'afficher
 *
 * Auteur : Florian Molinie, Benjamin Barillot , Komlagan Tekou
 *          & Matthias Mayol
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
        final JPopupMenu popMenu = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Film");
        menuItem1.addActionListener(new TraitementBtnCreaFilm());
        JMenuItem menuItem2 = new JMenuItem("Serie");
        menuItem2.addActionListener(new TraitementBtnCreaSerie());
        JMenuItem menuItem3 = new JMenuItem("Livre");
        menuItem3.addActionListener(new TraitementBtnCreaLivre());
        JMenuItem menuItem4 = new JMenuItem("Album");
        menuItem4.addActionListener(new TraitementBtnCreaAlbum());
        JMenuItem menuItem5 = new JMenuItem("JeuxVideo");
        menuItem5.addActionListener(new TraitementBtnCreaJeux());

        popMenu.add(menuItem1);
        popMenu.add(menuItem2);
        popMenu.add(menuItem3);
        popMenu.add(menuItem4);
        popMenu.add(menuItem5);
        Button BtnCrea = new Button("Création");
        BtnCrea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                    popMenu.show(e.getComponent(), e.getX(), e.getY());
                }

        });


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


    public class TraitementBtnCreaFilm implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            frame.add(new AddFilmForm().$$$getRootComponent$$$());
            frame.setVisible(true);
            frame.setSize(400, 400);
        }
    }
    public class TraitementBtnCreaSerie implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            frame.add(new AddSerieForm().$$$getRootComponent$$$());
            frame.setVisible(true);
            frame.setSize(400, 400);
        }
    }
    public class TraitementBtnCreaLivre implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            frame.add(new AddLivreForm().$$$getRootComponent$$$());
            frame.setVisible(true);
            frame.setSize(400, 400);
        }
    }
    public class TraitementBtnCreaAlbum implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            frame.add(new AddAlbumForm().$$$getRootComponent$$$());
            frame.setVisible(true);
            frame.setSize(400, 400);
        }
    }
    public class TraitementBtnCreaJeux implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            frame.add(new AddJeuxForm().$$$getRootComponent$$$());
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
