package Applet_Programming;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletProgramming extends Applet implements ActionListener{
	int v1,v2,sum;
	TextField t1=new TextField();
	TextField t2=new TextField();
	Label l1=new Label("First Term");
	Label l2=new Label("Second Term");
	Button b=new Button();
	Checkbox c=new Checkbox("add it");
	public void init()
	{
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		 c.addActionListener(this);
	}
	public void start()
	{
		b.addComponentListener("add");
	}
	public void paint(Graphics g)
	{
		g.drawString("sum:"+sum, 20, 70);
	}
	public void actionPerformed(ActionEvent e)
	{
		v1=Integer.parseInt(t1.getText());
		v2=Integer.parseInt(t2.getText());
		sum=v1+v2;
		repaint();
	}
	

}
