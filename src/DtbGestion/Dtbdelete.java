package src.DtbGestion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static src.TableSortFilterActu.mouse;


public class Dtbdelete {

    public void delete(){

        System.out.print("je suis dedans!");

        try (Connection connexion = SQLiteJDBCDriverConnection.connect()) {

            Statement statement = connexion.createStatement();
            System.out.print( "Objet requête créé !" );

            /* Exécution d'une requête de lecture */
             statement.executeUpdate("DELETE FROM Oeuvres WHERE Titre = '"+mouse+"'");
             System.out.print("Hey cest delete");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}

