package be.isims.ihm.tp4.ex1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

/**
 * CompteBancaireFrm
 * Une CompteBancaireFrm
 */
public class CompteBancaireFrm extends JFrame {

    public CompteBancaireFrm (String title, int width, int height) {
        super(title);
        configure(width, height);
        configureLayout();
        this.setVisible(true);
    }

    private void configure(int width, int height) {
        this.setMinimumSize(new Dimension(width, height));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void configureLayout() {
        this.setLayout(new FlowLayout());
        this.add(new JLabel("Montant : "));
        this.add(new JTextArea(1, 20));
        this.add(new JButton("Ajouter montant"));
        this.add(new JLabel("fdfdfdfdf"));
    }
}