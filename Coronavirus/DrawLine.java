package Coronavirus;
import java.applet.Applet;
import java.awt.Color;
public class DrawLine extends Applet{
	public void paint(java.awt.Graphics g)
	{
		setForeground(Color.red);
		g.drawArc(10,10,50,100,10,45);
		g.fillArc(100, 10,100, 100, 0, 90);
		
		
	}
}

