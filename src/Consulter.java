/**
 * CONSULTER
 *
 * La classe CONSULTER  est la classe qui permet d'afficher
 * une description détaillée de l'oeuvre choisie par l'utilisateur
 * en fonction du type d'oeuvre.
 *
 * Auteur : Florian Molinie, Benjamin Barillot , Komlagan Tekou
 *          & Matthias Mayol
 *
 * Version : 0.9.0 (26 Février 2018 13h00)
 *
 */


package src;

import javax.swing.*;

public class Consulter {
    public  void consult() {

        JOptionPane jopFilm, jopLivre, jopJeuxVideo, jopSerie, jopMusic;

        String titre = "Inception";
        String auteur = "Christopher Nolan";
        String origine = "Netflix";
        String DateDeSortie = "2010-07-21";
        String commentaire = "C'EST TROP BIEN WESH !";
        String langue = "Anglais";
        String Saison = "5";
        String nbEpisodes = "140";
        String nbjoueurs = "4";
        String console = "Nintendo";
        String duree = "148";
        String PEGI = "3";
        String genre = "Science-Fiction";
        String support = "numerique";
        String ISBN = "978047928227";


        jopFilm = new JOptionPane();
        ImageIcon img = new ImageIcon("src/Ressources/info.png");
        jopFilm.showMessageDialog(null, " Titre : " + titre + "\n"
                + " Auteur : " + auteur + "\n" + " Date de sortie : " + DateDeSortie + "\n"
                + " Durée : " + duree + "mn\n" + " Langue : " + langue + "\n"
                + " Genre : " + genre + "\n" + " Support : " + support + "\n"
                + " Orgine : " + origine + "\n"
                + " Commentaire : " + commentaire + "\n", titre , JOptionPane.INFORMATION_MESSAGE, img);

        jopLivre = new JOptionPane();
        jopLivre.showMessageDialog(null, " Titre : " + titre + "\n"
                + " Auteur : " + auteur + "\n" + " Date de sortie : " + DateDeSortie + "\n"
                + " Langue : " + langue + "\n" + " Genre : " + genre + "\n" + " Support : " + support + "\n"
                + " Code ISBN : " + ISBN + "\n" + " Orgine : " + origine + "\n"
                + " Commentaire : " + commentaire + "\n", titre, JOptionPane.INFORMATION_MESSAGE, img);

        jopJeuxVideo = new JOptionPane();
        jopJeuxVideo.showMessageDialog(null, " Titre : " + titre + "\n"
                + " Auteur : " + auteur + "\n" + " Date de sortie : " + DateDeSortie + "\n"
                + " Console : " + console + "\n" + " Langue : " + langue + "\n"
                + " Nombre de joueur : " + nbjoueurs + "\n" + " PEGI : " + PEGI + "\n"
                + " Genre : " + genre + "\n" + " Support : " + support + "\n"
                + " Orgine : " + origine + "\n"
                + " Commentaire : " + commentaire + "\n", titre, JOptionPane.INFORMATION_MESSAGE, img);

        jopSerie = new JOptionPane();
        jopSerie.showMessageDialog(null, " Titre : " + titre + "\n"
                + " Auteur : " + auteur + "\n" + " Date de sortie : " + DateDeSortie + "\n"
                + "  Nombre de saison : " + Saison + "\n" + " Nombre d'épisode : " + nbEpisodes + "\n" + " Langue : " + langue + "\n"
                + " Genre : " + genre + "\n" + " Support : " + support + "\n"
                + " Orgine : " + origine + "\n"
                + " Commentaire : " + commentaire + "\n", titre, JOptionPane.INFORMATION_MESSAGE, img);

        jopMusic = new JOptionPane();
        jopMusic.showMessageDialog(null, " Titre : " + titre + "\n"
                + " Auteur : " + auteur + "\n" + " Date de sortie : " + DateDeSortie + "\n"
                + " Durée : " + duree + "mn\n" + " Langue : " + langue + "\n"
                + " Genre : " + genre + "\n" + " Support : " + support + "\n"
                + " Orgine : " + origine + "\n"
                + " Commentaire : " + commentaire + "\n", titre, JOptionPane.INFORMATION_MESSAGE, img);
    }
}
