package SwingProg;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyComponent extends JFrame{
	JPanel p;
	JButton b;
	public static void main(String[] args) {
		MyComponent frame=new MyComponent();
		frame.setVisible(true);
	}
	MyComponent()
	{
		
		
	
	
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,100);
	p=new JPanel();
	b=new JButton("click me");
	
	
	p.add(b);
	
getContentPane().add(p,BorderLayout.CENTER);
	}

}
