package Applet_Programming;

import java.applet.Applet;
import java.awt.*;

public class Button extends Applet{
	TextField t1=new TextField("Please type ur text here",125);
	public void init()
	{
		t1.setEditable(false);
		add(t1);
	}
	public void paint(Graphics g)
	{
		g.drawString("Result:" + t1.getText(),100,80);
	}

}
