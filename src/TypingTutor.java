import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TypingTutor {
public static void main(String[] args) {
	TypingTutor t = new TypingTutor();
	t.CreateUI();
	char currentLetter;

	currentLetter = generateRandomLetter();

	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}


void CreateUI() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setTitle("Type or Die");
	frame.pack();
	frame.setVisible(true);
	
}
}
