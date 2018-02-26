package src.DtbGestion;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DtbSelect {

    public static void select(){
        try (Connection connexion = SQLiteJDBCDriverConnection.connect();) {
            /* Création de l'objet gérant les requêtes */
            Statement statement = connexion.createStatement();
            //System.out.print( "Objet requête créé !" );

            /* Exécution d'une requête de lecture */
            ResultSet resultat = statement.executeQuery("SELECT * FROM Oeuvres WHERE id=?");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

