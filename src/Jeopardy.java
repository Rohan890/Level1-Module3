import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jeopardy implements ActionListener {
	JButton hundo = new JButton();
	JButton fourhundo = new JButton();
	JButton sixhundo = new JButton();
	JButton eighthundo = new JButton();
	JButton racks = new JButton();
public static void main(String[] args) {
Jeopardy j = new Jeopardy();
j.createUI();
}
void createUI() {
	JFrame frame = new JFrame("Jeopardy");
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(hundo);
	panel.add(fourhundo);
	panel.add(sixhundo);
	panel.add(eighthundo);
	panel.add(racks);

	hundo.setText("$100");
	fourhundo.setText("$400");
	sixhundo.setText("$600");
	eighthundo.setText("$800");
	racks.setText("$1000");
	frame.pack();
	frame.setVisible(true);
	hundo.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == hundo) {
		String Qone = JOptionPane.showInputDialog("Sink it and you've scratched it");
			if(Qone.equals("Cue ball")) {
				JOptionPane.showMessageDialog(null,"Correct");
				int score = 0;
				score += 1;
				hundo.setEnabled(false);
			}
			else {
				JOptionPane.showMessageDialog(null,"Wrong");
				hundo.setEnabled(false);
			}
	if(e.getSource() == fourhundo) {
		String Qtwo = JOptionPane.showInputDialog("Aztek and Grand Prix");
		if(Qtwo.equals("What is Pontiac?")) {
			JOptionPane.showMessageDialog(null,"Correct");
			int score = 0;
			score += 1;
			hundo.setEnabled(false);
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong");
			hundo.setEnabled(false);
		}
	}
	if(e.getSource() == sixhundo) {
		String Qthree = JOptionPane.showInputDialog("Usually roasted, squab is a young one of these birds");
		if(Qthree.equals("What is a pigeon?")) {
			JOptionPane.showMessageDialog(null,"Correct");
			int score = 0;
			score += 1;
			hundo.setEnabled(false);
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong");
			hundo.setEnabled(false);
		}
		}
	if(e.getSource() == eighthundo) {
		String Qfour = JOptionPane.showInputDialog("This Star Wars movie; Episode III, leads up to where the orginal movie began");
		if(Qfour.equals("What is Revenge of the Sith?")) {
			JOptionPane.showMessageDialog(null,"Correct");
			int score = 0;
			score += 1;
			hundo.setEnabled(false);
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong");
			hundo.setEnabled(false);
		}
		}
	if(e.getSource() == racks) {
		String Qfive = JOptionPane.showInputDialog("The Rapid City Journal");
		if(Qfive.equals("What is South Dakota?")) {
			JOptionPane.showMessageDialog(null,"Correct");
			int score = 0;
			score += 1;
			hundo.setEnabled(false);
		}
		else {
			JOptionPane.showMessageDialog(null,"Wrong");
			hundo.setEnabled(false);
		}
		}
	}
}
}

