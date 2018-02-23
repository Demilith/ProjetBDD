import javax.swing.*;

public class Musique {
    private JPanel panel2;
    private JTextField titreTextField;
    private JTextField langueTextField;
    private JTextField auteurTextField;
    private JTextField duréeTextField;
    private JCheckBox checkBox1;
    private JTextField dateDeSortieTextField;
    private JTextField genreTextField;
    private JTextField supportTextField;
    private JTextArea commentaireTextArea;
    private JButton saveButton;

    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new Musique().panel2);
        Frame.setVisible(true);
        Frame.setSize(600, 600);
    }
}
