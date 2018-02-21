import DtbGestion.SQLiteJDBCDriverConnection;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TableFilms extends JPanel{
    private boolean DEBUG = false;

    public TableFilms(){
        super(new GridLayout(1, 0));
        try (Connection connexion = SQLiteJDBCDriverConnection.connect();){
            /* Création de l'objet gérant les requêtes */
            Statement statement =connexion.createStatement();
            //System.out.print( "Objet requête créé !" );

            /* Exécution d'une requête de lecture */
            ResultSet resultat =statement.executeQuery("SELECT Titre, Note, Date_sortie, " +
                    "Statut, Auteur, Genre" +
                    " FROM Oeuvres WHERE IdType=1;");
            //System.out.print( "Requête \"SELECT id, email, mot_de_passe, nom FROM Utilisateur;\" effectuée !" );

            String[] columnNames = {"Titre",
                    "Note", "Date_sortie",
                    "Statut", "Auteur", "Genre"};
            /* Récupération des données du résultat de la requête de lecture */

            List<Object[]> array = new ArrayList<>();

            while (resultat.next()) {
                String recherche = resultat.getString("Titre");
                String recherche2 = resultat.getString("Note");
                String recherche4 = resultat.getString("Date_sortie");
                String recherche7 = resultat.getString("Statut");
                String recherche8 = resultat.getString("Auteur");
                String recherche11 = resultat.getString("Genre");




                /* Formatage des données pour affichage dans la JSP finale. */
                //System.out.print("Données retournées par la requête de recherche: recherche = " + recherche + recherche2 + recherche3 + "\n");

                array.add(new Object[]{recherche, recherche2, recherche4, recherche7
                        , recherche8, recherche11});
            }

            Object[][] data = new Object[array.size()][];
            for (int i = 0; i < array.size(); i++) {
                data[i] = array.get(i);
            }

            final JTable table = new JTable(data, columnNames){
                public boolean isCellEditable(int row, int col){
                    return false;
                }
            };
            table.setPreferredScrollableViewportSize(new Dimension(500, 70));
            table.setFillsViewportHeight(true);

            //Create the scroll pane and add the table to it.
            JScrollPane scrollPane = new JScrollPane(table);
            add(scrollPane);

        } catch (SQLException e) {
            System.out.print("Erreur lors de la connexion : <br/>"
                    + e.getMessage());
        }
    }
}
