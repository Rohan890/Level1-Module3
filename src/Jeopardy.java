import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jeopardy implements ActionListener {
	JButton hundo = new JButton();
	JButton fourhundo = new JButton();
	JButton sixhundo = new JButton();
	JButton eighthundo = new JButton();
	JButton racks = new JButton();
public static void main(String[] args) {

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
			JButton Qone = new JButton();
			Qone.setText("What be the do?");
			if(e.getSource() == Qone) {
				JButton Qanswer = new JButton();
			}
	if(e.getSource() == fourhundo) {
		JButton Qtwo = new JButton();
		if(e.getSource() == Qtwo) {
			JButton Qanswer = new JButton();
		}
	}
		}
	}
}

