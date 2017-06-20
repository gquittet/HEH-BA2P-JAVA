import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Editor extends JFrame implements Observer, ActionListener, KeyListener {

    private Document subject;
    private JTextArea jTextArea;

    public Editor(Document subject) {
	this.subject = subject;
	this.subject.attach(this);
	initWindow();
    }

    private void initWindow() {
	setSize(600, 400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton openButton = new JButton("Open");
	openButton.addActionListener(this);
	jTextArea = new JTextArea(subject.getText());
	jTextArea.addKeyListener(this);
	add(openButton, BorderLayout.NORTH);
	add(jTextArea, BorderLayout.CENTER);
	setVisible(true);
    }

    @Override
    public void update() {
	jTextArea.setText(subject.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	new Editor(subject);
    }

    @Override
    public void keyPressed(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) {
	subject.setText(jTextArea.getText());
	subject.notifie();
}

    @Override
    public void keyTyped(KeyEvent e) { }

}
