package net.sqlitetutorial;

import DtbGestion.SQLiteJDBCDriverConnection;

import java.sql.*;

/**
 *
 * @author sqlitetutorial.net
 */
public class Dtbinsert {
    public static void insert() {
        try (Connection connexion = SQLiteJDBCDriverConnection.connect();){
            /* Création de l'objet gérant les requêtes */
            Statement statement =connexion.createStatement();
            //System.out.print( "Objet requête créé !" );

            /* Exécution d'une requête de lecture */
            ResultSet resultat =statement.executeQuery("INSERT INTO Oeuvres(Titre,Notes) VALUES(?,?)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
