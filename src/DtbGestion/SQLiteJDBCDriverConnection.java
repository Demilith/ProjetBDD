package DtbGestion;

import java.sql.*;



public class SQLiteJDBCDriverConnection {
            /**
             * Connect to a sample database
             */
            public static Connection connect() {

                Connection connexion = null;
                Statement statement = null;
                ResultSet resultat = null;
                try {
                    // db parameters
                    String url = "jdbc:sqlite:src\\Ressources\\bdd_multimedia.db";
                    // create a connection to the database
                    connexion = DriverManager.getConnection(url);

                    System.out.println("Connection to SQLite has been established.");


                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                return connexion;
            }
        }
