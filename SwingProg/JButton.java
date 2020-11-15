package SwingProg;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

public class JButton {
public JButton(String string) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(640,470);
	frame.setLocation(200,150);
	frame.setBounds(450,100,480,450);
	
	Container c=frame.getContentPane();
	c.setLayout(null);
	JButton butt=new JButton("hi");
	butt.setText("Click Me");
	frame.add(butt);
}

private void setText(String string) {
	// TODO Auto-generated method stub
	
}

public void setPreferredSize(Dimension dimension) {
	// TODO Auto-generated method stub
	
}
}
