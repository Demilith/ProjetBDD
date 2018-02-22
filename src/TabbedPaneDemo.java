import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class TabbedPaneDemo extends JPanel {
    public TabbedPaneDemo() {
        super(new GridLayout(1, 1));

        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = createImageIcon("download.jpg");

        JComponent panel0 = new TableSortFilterActu();
        tabbedPane.addTab("Derniers Ajouts", icon, panel0,
                "Still does nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);

        JComponent panel1 = new TableSortFilterLivre();
        tabbedPane.addTab("Livres", icon, panel1,
                "Does nothing");
        tabbedPane.setSelectedIndex(1);
        //SimpleTableDemo simple = new SimpleTableDemo();
        //panel1.add(simple);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

        JComponent panel2 = new TableSortFilterFilm();
        tabbedPane.addTab("Films", icon, panel2,
                "Does twice as much nothing");
        tabbedPane.setSelectedIndex(0);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        JComponent panel3 = new TableSortFilterSerie();
        tabbedPane.addTab("Série", icon, panel3,
                "Still does nothing");
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);

        JComponent panel4 = new TableSortFilterAlbum();
        panel4.setPreferredSize(new Dimension(410, 50));
        tabbedPane.addTab("Album", icon, panel4,
                "Does nothing at all");
        tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);

        JComponent panel5 = new TableSortFilterJeux();
        tabbedPane.addTab("Jeux Vidéos", icon, panel5,
                "Still does nothing");
        tabbedPane.setMnemonicAt(5, KeyEvent.VK_6);
        //Add the tabbed pane to this panel.



        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        ChangeListener changelistener = (ChangeEvent changeEvent) -> {
            JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
            int Index = sourceTabbedPane.getSelectedIndex();
            //System.out.println("Default Index:" + Index);
            /*if (Index == 0) {
                System.out.println("Tab changed to: " + " 0 ");
            }
            else if (Index == 1) {
                System.out.println("Tab changed to: " + " 1 ");
            }
            else if (Index == 2) {
                System.out.println("Tab changed to: " + " 2 ");
            }
            else if (Index == 3) {
                System.out.println("Tab changed to: " + " 3 ");
            }
            else if (Index == 4) {
                System.out.println("Tab changed to: " + " 4 ");
            }
            else if (Index == 5) {
                System.out.println("Tab changed to: " + " 5 ");
            }*/
            /**switch (Index) {
                case 0:
                    public void changed (ActionEvent e) {

                    // For sake of simplicity I'm ignoring the original button logic here
                    // and focussing on just getting an icon loaded in the parent frame...

                    ImageIcon Icone = new ImageIcon("star.jpg");
                    // Just pass the icon itself rather than a new label.
                    find.setImage(Icone);
                    }

                    System.out.println("Tab changed to: " + " 0 ");
                    break;
                case 1:
                    System.out.println("Tab changed to: " + " 1 ");
                    break;
                case 2:
                    System.out.println("Tab changed to: " + " 2 ");
                    break;
                case 3:
                    System.out.println("Tab changed to: " + " 3 ");
                    break;
                case 4:
                    System.out.println("Tab changed to: " + " 4 ");
                    break;
                case 5:
                    System.out.println("Tab changed to: " + " 5 ");
                    break;
           }**/


       };

        tabbedPane.addChangeListener(changelistener);
    }
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabbedPaneDemo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from
     * the event dispatch thread.
     */
}