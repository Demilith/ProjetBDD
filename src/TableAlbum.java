import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TableAlbum extends JPanel {
    private boolean DEBUG = false;

    public TableAlbum() {
        super(new GridLayout(1, 0));
        String url = "jdbc:sqlite:src\\Ressources\\bdd_multimedia.db";
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            //System.out.print( "Connexion à la base de données..." );
            connexion = DriverManager.getConnection(url);
            //System.out.print( "Connexion réussie !" );

            /* Création de l'objet gérant les requêtes */
            statement = connexion.createStatement();
            //System.out.print( "Objet requête créé !" );

            /* Exécution d'une requête de lecture */
            resultat = statement.executeQuery("SELECT Titre, Note, Date_sortie, " +
                    "Statut, Auteur, Genre" +
                    " FROM Oeuvres WHERE IdType=5;");
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
        } finally {
            //System.out.print( "Fermeture de l'objet ResultSet." );
            if (resultat != null) {
                try {
                    resultat.close();
                } catch (SQLException ignore) {
                }
            }
            //System.out.print( "Fermeture de l'objet Statement." );
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }
            //System.out.print( "Fermeture de l'objet Connection."
            if (connexion != null) {
                try {
                    connexion.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }
}

