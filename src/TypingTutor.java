import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	JLabel jLabel = new JLabel();
	JPanel panel = new JPanel();
public static void main(String[] args) {
	TypingTutor t = new TypingTutor();
	t.CreateUI();
}
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}


void CreateUI() {
	JFrame frame = new JFrame();
	frame.setTitle("Type or Die");

	frame.setVisible(true);
	currentLetter = generateRandomLetter();
	jLabel.setFont(jLabel.getFont().deriveFont(28.0f));
	jLabel.setHorizontalAlignment(JLabel.CENTER);
	jLabel.setText(currentLetter + "");
	panel.add(jLabel);
	frame.add(panel);
	frame.addKeyListener(this);
	frame.pack();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stu
	if(e.getKeyChar() == currentLetter) {
		panel.setBackground(Color.green);
	}
	else {
		panel.setBackground(Color.red);
	}
	currentLetter = generateRandomLetter();
	jLabel.setText(currentLetter + "");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
