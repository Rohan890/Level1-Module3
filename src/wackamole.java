import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class wackamole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
int score = 0;
int times = 0;
Date d = new Date();


public static void main(String[] args) {
	wackamole m = new wackamole();
	m.createUi();
	
}
void createUi() {
	frame.add(panel);
	drawButtons();
	frame.setSize(300, 800);
	frame.setVisible(true);

}
void drawButtons() {
Random r = new Random();
int n = r.nextInt(24);
for (int i = 0; i < 24; i++) {
	JButton b = new JButton();
	panel.add(b);
	b.addActionListener(this);
	if(i == n) {
		b.setText("mole");
	}
}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton f = (JButton) e.getSource();
	if(f.getText().equals("mole")) {
		playSound("9056__dobroide__slot-machine-arcade.wav");
		score += 1;
		
		
	}
	
	else {
		speak("no " + "you");
		times += 1;
	}
frame.remove(panel);
panel = new JPanel();
frame.add(panel);
drawButtons();
if(score == 10) {
	endGame(d, 10);
	frame.dispose();
}
if(times == 5) {
	frame.dispose();
	JOptionPane.showMessageDialog(null, "You lose");
}
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}

}
