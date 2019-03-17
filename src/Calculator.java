import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton add = new JButton();
JButton sub = new JButton();
JButton mult = new JButton();
JButton div = new JButton();
JTextField box1 = new JTextField();
JTextField box2 = new JTextField();
public static void main(String[] args) {
Calculator c = new Calculator();
c.createGUI();
}
void createGUI() {
	frame.add(panel);
	panel.add(add);
	panel.add(sub);
	panel.add(mult);
	panel.add(div);
	add.setText("add");
	sub.setText("sub");
	mult.setText("mul");
	div.setText("div");
	panel.add(box1);
	box1.setPreferredSize(new Dimension(200,25));
	box2.setPreferredSize(new Dimension(200,25));
	panel.add(box2);
	add.addActionListener(this);
	sub.addActionListener(this);
	mult.addActionListener(this);
	div.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== add) {
		String a = box1.getText();
		String b = box2.getText();
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		JOptionPane.showMessageDialog(null, c+d);  
	}
	if(e.getSource()== sub) {
		String a = box1.getText();
		String b = box2.getText();
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		JOptionPane.showMessageDialog(null, c-d);  
	}
	if(e.getSource()== mult) {
		String a = box1.getText();
		String b = box2.getText();
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		JOptionPane.showMessageDialog(null, c*d);  
	}
	if(e.getSource()== div) {
		String a = box1.getText();
		String b = box2.getText();
		double c = Integer.parseInt(a);
		double d = Integer.parseInt(b);
		JOptionPane.showMessageDialog(null, c/d);  
	}
}
}
