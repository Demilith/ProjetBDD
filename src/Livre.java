import javax.swing.*;

public class Livre {
    private JPanel panel2;
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
    private JButton saveButton;

    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setContentPane(new Livre().panel2);
        Frame.setVisible(true);
        Frame.setSize(600, 600);
    }
}
