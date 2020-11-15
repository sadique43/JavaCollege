package SwingProg;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JpasswordField {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640,470);
		frame.setLocation(200,150);
		frame.setBounds(450,100,480,450);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		JLabel label=new JLabel("Password");
		c.add(label);
		label.setBounds(100,20,300,40);
		JPasswordField pass=new JPasswordField();
		pass.setBounds(100,50,200,30);
		pass.setBackground(Color.YELLOW);
	
		Color c2=new Color(200,1,2);
		pass.setForeground(c2);
		c.add(pass);
	}

}
