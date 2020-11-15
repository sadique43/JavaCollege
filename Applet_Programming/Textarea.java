package Applet_Programming;

import java.applet.Applet;
import java.awt.TextArea;

public class Textarea extends Applet {
	TextArea t1=new TextArea("please write your review here");
	public void init()
	{
		add(t1);
	}

}
