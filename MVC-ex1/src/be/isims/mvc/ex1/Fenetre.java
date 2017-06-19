package be.isims.mvc.ex1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fenetre extends JFrame implements Observer {

    private Controleur ctrl;
    private Modele modele;
    private JLabel jMinusculeLabel;
    private JLabel jMajusculeLabel;
    private JLabel jChiffresLabel;

    public Fenetre(Controleur ctrl) {
	this.ctrl = ctrl;
	this.modele = ctrl.getModele();
	initFenetre();
    }

    private void initFenetre() {
	setSize(600, 400);
	setLocationRelativeTo(null);

	JPanel mainPanel = new JPanel();
	mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
	this.getContentPane().add(mainPanel, BorderLayout.CENTER);

	JTextField jTextField = new JTextField(ctrl.getModele().getTexte().getTexte());
	jTextField.setMaximumSize(new Dimension(200, 20));
	jTextField.setEditable(false);
	mainPanel.add(jTextField);

	JButton jButton = new JButton("Click");
	jButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    ctrl.notifie();
		}
	    });
	mainPanel.add(jButton);

	jMinusculeLabel = new JLabel("Minuscules: 0");
	jMajusculeLabel = new JLabel("Majuscules: 0");
	jChiffresLabel = new JLabel("Chiffres: 0");

	mainPanel.add(jMinusculeLabel);
	mainPanel.add(jMajusculeLabel);
	mainPanel.add(jChiffresLabel);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actualise() {
	jMinusculeLabel.setText("Minuscules: " + modele.getNbrMinuscules());
	jMajusculeLabel.setText("Majuscules: " + modele.getNbrMajuscules());
	jChiffresLabel.setText("Chiffres: " + modele.getNbrChiffres());
    }
}
