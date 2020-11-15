package Applet_Programming;

import java.applet.Applet;
import java.awt.Graphics;

public class PARAMtag extends Applet{
	public void paint(Graphics g)
	{
		String str=this.getParameter("sadique");
		g.drawString(str, 100, 80);
	}
	

}
