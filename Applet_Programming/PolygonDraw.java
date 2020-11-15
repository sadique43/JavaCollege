package Applet_Programming;

import java.applet.Applet;
import java.awt.Graphics;

public class PolygonDraw extends Applet {
	int x[]= {20,40,10};
	int y[]= {100,300,300};
	
	public void paint(Graphics g)
	{
		g.drawPolygon(x, y, 3);
	}

}
