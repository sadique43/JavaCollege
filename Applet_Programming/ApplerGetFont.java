package Applet_Programming;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class ApplerGetFont extends Applet {
	Font obj=new Font("Times New Roman",Font.BOLD,20);
	Font obj1=new Font("Serif",Font.ITALIC,40);
	public void paint(Graphics g)
	{
		g.setFont(obj);
		g.drawString("sadique", 100, 80);
		g.drawString("the current font is: " + g.getFont(), 130,100);
		g.setFont(obj1);
		g.drawString("welcome to ITER", 100, 150);
		g.drawString("the current font is: " + g.getFont(), 130,220);
	}
}
