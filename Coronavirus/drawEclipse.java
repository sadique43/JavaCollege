package Coronavirus;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class drawEclipse  extends Applet{
	public void init()
	{
		setBackground(Color.red);
		setForeground(Color.green);
	}
	public void paint(Graphics g)//in paint method we have to pass the object of the graphic class
	{
		g.drawOval(10, 10, 50, 50);
		g.fillOval(100, 10, 75, 50);
		g.drawOval(190, 10, 90, 30);
		g.fillOval(70, 90, 140, 100);

}
}
