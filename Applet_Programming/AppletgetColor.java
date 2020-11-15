package Applet_Programming;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AppletgetColor extends Applet{
	Color obj=new Color(23,45,78);
	public void paint(Graphics g)
	{
		g.setColor(obj);
		g.drawString("sadique", 100, 80);
		g.drawString("The current color applied is" + g.getColor(), 100, 120);
	}

}
