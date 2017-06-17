package observer.ex1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

/**
 * JWindows
 */
public class JWindows extends JFrame {

    public JWindows(String title) {
        super(title);
        initWindow();
        initComponents();
    }

    private void initWindow() {
        this.setSize(new Dimension(480, 360));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        this.setLayout(new FlowLayout());
        JButton buttonRed = new JButton("Rouge");
        this.add(buttonRed);
        JButton buttonGreen = new JButton("Vert");
        this.add(buttonGreen);
        JLabel label = new JLabel("Ceci est un label");
        this.add(label);
        buttonRed.addActionListener(new Observateur(label));
        buttonGreen.addActionListener(new Observateur(label));
    }

}