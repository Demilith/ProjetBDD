

import src.AddForm;

import javax.swing.*;

public class JeuxVideo {
    private JPanel panel2;
    private JTextField titreTextField;
    private JTextField origineTextField;
    private JTextField consoleTextField;
    private JTextField dateDeSortieTextField;
    private JTextField nbJoueurTextField;
    private JTextField pegiTextField;
    private JCheckBox checkBox1;
    private JTextField langueTextField1;
    private JTextField genreTextField;
    private JTextArea commentaireTextArea;
    private JButton saveButton;

    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new JeuxVideo().panel2);
        Frame.setVisible(true);
        Frame.setSize(600, 600);
    }
}
