/**
 * TableSortFilterActu
 *
 * La classe TableSortFilterActu  est la classe qui permet
 * d'afficher dans un JTable les 3 derniers ajout a la bdd
 *
 * Auteur : Florian Molinie, Benjamin Barillot , Komlagan Tekou
 *          & Matthias Mayol
 *
 * Version : 0.9.0 (26 Février 2018 13h00)
 *
 */
package src;


import src.DtbGestion.SQLiteJDBCDriverConnection;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TableSortFilterActu extends JPanel{


    public static String mouse;


    private boolean DEBUG = false;
    private JOptionPane mouse1;


    public TableSortFilterActu()      {
        this.mouse = mouse;
        try (Connection connexion = SQLiteJDBCDriverConnection.connect()) {
            Statement statement = connexion.createStatement();
            //System.out.print( "Objet requête créé !" );

            /* Exécution d'une requête de lecture */
            ResultSet resultat = statement.executeQuery("SELECT * FROM Oeuvres, TypesOeuvre WHERE IdTypes=IdType" +
                    " ORDER BY date_add DESC LIMIT 3");

            String[] columnNames = {"Titre",
                    "Note", "Date_sortie",
                    "Statut", "Auteur", "Genre", "Type"};

            List<Object[]> array = new ArrayList<>();
            while (resultat.next()) {
                String recherche = resultat.getString("Titre");
                String recherche2 = resultat.getString("Note");
                String recherche4 = resultat.getString("Date_sortie");
                String recherche7 = resultat.getString("Statut");
                String recherche8 = resultat.getString("Auteur");
                String recherche11 = resultat.getString("Genre");
                String recherche12 = resultat.getString("TypeOeuvre");
                array.add(new Object[]{recherche, recherche2, recherche4, recherche7
                        , recherche8, recherche11, recherche12});
            }
            Object[][] data = new Object[array.size()][];
            for (int i = 0; i < array.size(); i++) {
                data[i] = array.get(i);
            }

            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            JTable jTable = new JTable(model);

            jTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (e.getValueIsAdjusting()) {

                        jTable.getSelectedRow();
                        //System.out.print(jTable.getValueAt(jTable.getSelectedRow(),jTable.getSelectedColumn()).toString()+"\n");
                        TableSortFilterActu.mouse = jTable.getValueAt(jTable.getSelectedRow(),jTable.getSelectedColumn()).toString();

                         System.out.print(mouse);


                    }

                }

            });





            TableRowSorter<TableModel> rowSorter
                    = new TableRowSorter<>(jTable.getModel());
            JTextField jtfFilter = new JTextField();
            JButton jbtFilter = new JButton("Filter");


                jTable.setRowSorter(rowSorter);

                JPanel panel = new JPanel(new BorderLayout());
                panel.add(new JLabel("Tapez votre recherche:"),
                        BorderLayout.WEST);
                panel.add(jtfFilter, BorderLayout.CENTER);

                setLayout(new BorderLayout());
                add(panel, BorderLayout.NORTH);
                add(new JScrollPane(jTable), BorderLayout.CENTER);

                jtfFilter.getDocument().addDocumentListener(new DocumentListener() {

                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        String text = jtfFilter.getText();

                        if (text.trim().length() == 0) {
                            rowSorter.setRowFilter(null);
                        } else {
                            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                        }
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        String text = jtfFilter.getText();

                        if (text.trim().length() == 0) {
                            rowSorter.setRowFilter(null);
                        } else {
                            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                        }
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }

                });

            } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Row Filter");
                frame.add(new TableSortFilterActu());
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }

    public String mousereturn() {
        return mouse;
    }


}





