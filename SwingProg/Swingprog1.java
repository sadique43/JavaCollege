package SwingProg;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Swingprog1 {
	public static void main(String[] args) {
		
	
JFrame frame=new JFrame();
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(640,470);
frame.setLocation(200,150);
frame.setBounds(450,100,480,450);
frame.setTitle("King Deals 4 U");
ImageIcon icon=new ImageIcon("D:\\sadique1\\src\\SwingProg\\shayari.png");
frame.setIconImage(icon.getImage());
Container c=frame.getContentPane();
c.setBackground(Color.RED);
frame.setResizable(false);

	}
}
