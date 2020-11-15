package Applet_Programming;

import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;

public class Labels extends Applet {
 Label lb1=new Label("first name");
 TextField t1=new TextField();
 public void init()
 {
	 add(lb1);
	 add(t1);
 }

}
