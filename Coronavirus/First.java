package Coronavirus;

import java.awt.Button;

import java.awt.Frame;

public class First extends Frame{
	First()
	{
		Button b=new Button("click me");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		System.out.println("this is my first button using java AWT");
		First f=new First();
		
	}

}
