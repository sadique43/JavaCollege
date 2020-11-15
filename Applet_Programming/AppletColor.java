package Applet_Programming;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class AppletColor extends Applet{
	Font obj=new Font("Serif",Font.BOLD,20);
	Color obj1=new Color(53,223,45);
	public void paint(Graphics g)
	{
		g.setFont(obj);
		g.setColor(obj1);
		g.drawString("Sadique loves ", 100, 80);
		
	}

}
