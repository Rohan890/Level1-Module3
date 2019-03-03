import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();
public static void main(String[] args) {
	ChuckleClicker c = new ChuckleClicker();
	c.makeButton();
}
void makeButton() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	joke.setText("Joke");
	punchline.setText("Punchline");
	panel.add(joke);
	panel.add(punchline);
	frame.pack();
	frame.setVisible(true);
	joke.addActionListener(this);
	punchline.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "hi");
	}

	else if(e.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "hi");
	}
}
}
