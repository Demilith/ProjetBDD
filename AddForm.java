import javax.swing.*;
import java.awt.*;

public class AddForm extends Container {
    private JPanel panel1;
    private JCheckBox statutCheckBox;
    private JTextArea commentaireTextArea;
    private JTextField titreTextField;
    private JButton button1;
    private JTextField genreTextField;
    private JTextField auteurTextField;
    private JTextField supportTextField;
    private JTextField langueTextField;
    private JTextField origineTextField;
    private JFormattedTextField a1999FormattedTextField;
    private JTextField duréeTextField;
    private StarRater starRater;

    public static void main(String[] args) {
        JFrame Frame = new JFrame();
        Frame.setContentPane(new AddForm().panel1);
        Frame.setVisible(true);
        Frame.setSize(600, 600);
    }
}

