package src.DtbGestion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Dtbupdate {

    public static void update() {
        try (Connection connexion = SQLiteJDBCDriverConnection.connect();) {
            /* Création de l'objet gérant les requêtes */
            Statement statement = connexion.createStatement();
            //System.out.print( "Objet requête créé !" );

            /* Exécution d'une requête de lecture */
            ResultSet resultat = statement.executeQuery("UPDATE Oeuvres SET Titre = ? , "
                    + "Note = ? "
                    + "WHERE id = ?");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
