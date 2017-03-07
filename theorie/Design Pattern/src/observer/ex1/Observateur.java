package observer.ex1;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Observateur
 */
public class Observateur implements ActionListener {

    private JLabel label;

    public Observateur(JLabel label) {
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton button = (JButton) ae.getSource();
        label.setText(button.getText());
    }
}