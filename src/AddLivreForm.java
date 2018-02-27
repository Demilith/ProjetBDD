package src;

import src.StarRater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLivreForm {

    private static int selection;
    private JTextField titreTextField;
    private JTextField origineTextField;
    private JTextField auteurTextField;
    private JCheckBox checkBox1;
    private JTextField langueTextField;
    private JTextField dateDeSortieTextField;
    private JTextField genreTextField;
    private JTextField supportTextField;
    private JTextField ISBNTextField;
    private JTextArea commentaireTextArea;
    private JPanel panel3;
    private JButton button1;
    private StarRater starRater1;

    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new AddLivreForm().panel3);
        Frame.setVisible(true);
        Frame.setSize(600, 600);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        auteurTextField = new JTextField();
        auteurTextField.setText("Auteur");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(auteurTextField, gbc);
        genreTextField = new JTextField();
        genreTextField.setText("Genre");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(genreTextField, gbc);
        langueTextField = new JTextField();
        langueTextField.setText("Langue");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(langueTextField, gbc);
        origineTextField = new JTextField();
        origineTextField.setText("Origine");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(origineTextField, gbc);
        ISBNTextField = new JTextField();
        ISBNTextField.setText("ISBN");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(ISBNTextField, gbc);
        titreTextField = new JTextField();
        titreTextField.setText("Titre");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(titreTextField, gbc);
        commentaireTextArea = new JTextArea();
        commentaireTextArea.setText("Commentaire");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridheight = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(commentaireTextArea, gbc);
        button1 = new JButton();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String supportgetText = supportTextField.getText();
                String titregetText = titreTextField.getText();
                String genregetText = genreTextField.getText();
                String commentairegetText = commentaireTextArea.getText();
                String auteurgetText = auteurTextField.getText();
                String languegetText = langueTextField.getText();
                String originegetText = origineTextField.getText();
                String dategetText = dateDeSortieTextField.getText();
                String ISBNgetText = ISBNTextField.getText();
                boolean statutgetBox = checkBox1.isSelected();
                int starrater = selection;
                System.out.println(supportgetText + "." + titregetText + "." + genregetText + "." + statutgetBox + "." + starrater);

                src.DtbGestion.Dtbinsert.insert("SELECT * FROM Oeuvres");

            }
        });
        button1.setText("Button");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(button1, gbc);
        starRater1 = new StarRater();
        starRater1.addStarListener(
                new StarRater.StarListener()   {

                    public void handleSelection(int selection) {
                        System.out.println(selection);
                        AddLivreForm.selection= selection;
                    }
                });
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel3.add(starRater1, gbc);
        supportTextField = new JTextField();
        supportTextField.setText("Support");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(supportTextField, gbc);
        checkBox1 = new JCheckBox();
        checkBox1.setText("CheckBox");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel3.add(checkBox1, gbc);
        dateDeSortieTextField = new JTextField();
        dateDeSortieTextField.setText("Date de sortie");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(dateDeSortieTextField, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel3;
    }
}
