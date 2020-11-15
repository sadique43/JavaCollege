package SwingProg;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextField {
public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(640,470);
	frame.setLocation(200,150);
	frame.setBounds(450,100,480,450);
	
	Container c=frame.getContentPane();
	c.setLayout(null);
	JTextField tf=new JTextField();
	tf.setBounds(100,50,200,40);
	Font font=new Font("Aerial",Font.ITALIC,32);
	tf.setFont(font);
	Color c1=new Color(123,67,89);
	tf.setBackground(c1);
	
	c.add(tf);
	JTextArea ta=new JTextArea();
	ta.setBounds(520,70,820,60);
	ta.setBackground(Color.GREEN);
	Font font1=new Font("Aerial",Font.BOLD,32);
	ta.setFont(font1);
	c.add(ta);
}
}
