import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton button = new JButton();
	Random o = new Random();
	Random t = new Random();
	Random h = new Random();
	int win = 0;
public static void main(String[] args) {
	SlotMachine s = new SlotMachine();
	s.createGui();
}	
void createGui() {
	frame.add(panel);
	panel.add(label1);
	panel.add(label2);
	panel.add(label3);
	button.setText("REEL");
	button.addActionListener(this);
	panel.add(button);
	frame.setVisible(true);
	frame.pack();

}
void Randomize() {
	panel.remove(label1);
	panel.remove(label2);
	panel.remove(label3);
	int one = o.nextInt(3);
	int two = t.nextInt(3);
	int three = h.nextInt(3);
	if(one == 0) {
		label1 = loadImage("slotreelONE.jpg");
		panel.add(label1);
	}
	if(one == 1) {
		label1 = loadImage("slotreelTWO.jpg");
		panel.add(label1);
	}	
	if(one == 2) {
		label1 = loadImage("slotreelTHREE.jpg");
		panel.add(label1);
	}
	if(two == 0) {
		label2 = loadImage("slotreelONE.jpg");
		panel.add(label2);
	}
	if(two == 1) {
		label2 = loadImage("slotreelTWO.jpg");
		panel.add(label2);
	}	
	if(two == 2) {
		label2 = loadImage("slotreelTHREE.jpg");
		panel.add(label2);
	}
	if(three == 0) {
		label3 = loadImage("slotreelONE.jpg");
		panel.add(label3);
	}
	if(three == 1) {
		label3 = loadImage("slotreelTWO.jpg");
		panel.add(label3);
	}	
	if(three == 2) {
		label3 = loadImage("slotreelTHREE.jpg");
		panel.add(label3);
	}
	frame.pack();
	if(one == two && three == two) {
		JOptionPane.showMessageDialog(null, "You won the JACKPOT!");
		win+= 1;
		System.out.println("Win Count:" + win);
	}
}
private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button) {

		Randomize();
	}
}
}

