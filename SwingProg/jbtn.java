package SwingProg;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class jbtn extends JComponent{
public static JButton btn;
public static void main(String args[])
{
	JFrame frame=new JFrame("button");
	btn=new JButton("Click Me");
	
	
	
	

			Component c=frame.getContentPane();
			c.add(btn);
			frame.setSize(300,300);
			frame.setVisible(true);
			frame.setLayout(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			}


}
