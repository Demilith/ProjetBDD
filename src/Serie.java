import src.StarRater;

import javax.swing.*;
import java.awt.*;

public class Serie {

    private JTextField titreTextField;
    private JTextField genreTextField;
    private JTextField réalisateurTextField;
    private JTextField duréeTextField;
    private JTextField langueTextField;
    private JTextField dateDeSortieTextField;
    private JTextField origineTextField;
    private JCheckBox checkBox1;
    private JTextField supportTextField;
    private JTextArea commentaireTextArea;
    private JTextField nbEpisodesTextField;
    private JTextField nbSaisonTextField;
    private JButton saveButton;
    private JPanel panel5;
    private StarRater starRater;

    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new Serie().panel5);
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
        panel5 = new JPanel();
        panel5.setLayout(new GridBagLayout());
        genreTextField = new JTextField();
        genreTextField.setText("Genre");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(genreTextField, gbc);
        réalisateurTextField = new JTextField();
        réalisateurTextField.setText("Réalisateur");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(réalisateurTextField, gbc);
        langueTextField = new JTextField();
        langueTextField.setText("Langue");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(langueTextField, gbc);
        duréeTextField = new JTextField();
        duréeTextField.setText("Durée");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(duréeTextField, gbc);
        checkBox1 = new JCheckBox();
        checkBox1.setText("CheckBox");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        panel5.add(checkBox1, gbc);
        dateDeSortieTextField = new JTextField();
        dateDeSortieTextField.setText("Date de sortie");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(dateDeSortieTextField, gbc);
        supportTextField = new JTextField();
        supportTextField.setText("Support");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(supportTextField, gbc);
        titreTextField = new JTextField();
        titreTextField.setText("Titre");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(titreTextField, gbc);
        commentaireTextArea = new JTextArea();
        commentaireTextArea.setText("Commentaire");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        panel5.add(commentaireTextArea, gbc);
        origineTextField = new JTextField();
        origineTextField.setText("Origine");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(origineTextField, gbc);
        nbEpisodesTextField = new JTextField();
        nbEpisodesTextField.setText("NbEpisodes");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(nbEpisodesTextField, gbc);
        nbSaisonTextField = new JTextField();
        nbSaisonTextField.setText("NbSaison");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(nbSaisonTextField, gbc);
        saveButton = new JButton();
        saveButton.setText("Save");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel5.add(saveButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel5;
    }
}
