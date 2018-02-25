package src.DtbGestion;
import DtbGestion.SQLiteJDBCDriverConnection;
import src.TableSortFilterActu;
import src.TableSortFilterActu.*;
import java.sql.*;


public class Dtbdelete {


    public static void delete(){
        String mouse = TableSortFilterActu.mouse;
    try (Connection connexion = SQLiteJDBCDriverConnection.connect();){
        /* Création de l'objet gérant les requêtes */
        Statement statement =connexion.createStatement();
        //System.out.print( "Objet requête créé !" );

        /* Exécution d'une requête de lecture */
        ResultSet resultat =statement.executeQuery("DELETE FROM Oeuvres WHERE Titre = "+mouse+"");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
