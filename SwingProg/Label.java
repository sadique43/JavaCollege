package SwingProg;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(640,470);
		frame.setLocation(200,150);
		frame.setBounds(450,100,480,450);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		ImageIcon icon=new ImageIcon("D:\\\\sadique1\\\\src\\\\SwingProg\\\\shayari.png");
		
		JLabel label=new JLabel("User Name");
		label.setIcon(icon);
		label.setBounds(100,200,250,70);
		label.setText("Password");
		Font font=new Font("Times New Roman",Font.BOLD,25);
		label.setFont(font);
		
		
		
		c.add(label);
		
	}

}
