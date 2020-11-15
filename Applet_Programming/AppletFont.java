package Applet_Programming;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class AppletFont extends Applet {
Font obj=new Font("Times New Roman",Font.ITALIC,20);
public void paint(Graphics g)
{
	g.setFont(obj);
	g.drawString("sadique",100,80);
	g.drawString("Welcome to",100,110);
	g.drawString("Akhtar and Haque production company App",300,140);
}
}
