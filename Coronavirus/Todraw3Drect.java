package Coronavirus;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Todraw3Drect extends Applet{
	public void init()
	{
		setBackground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.draw3DRect(25, 10, 50, 75, true);
		g.draw3DRect(25, 110, 50, 75, false);
		g.fill3DRect(100, 10, 50, 75, true);
		g.fill3DRect(100, 110, 50, 75, false);
	}

}
