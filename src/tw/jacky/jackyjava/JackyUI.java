package tw.jacky.jackyjava;

import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JackyUI extends JFrame{
	
	public JackyUI()
	{
		Container c=getContentPane();
		setSize(400,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		DrawLine dl=new DrawLine();
		c.add(dl);
	}
	
	
	public static void main(String[]  args)
	{
		new JackyUI();
	}
	
	class DrawLine extends JPanel
	{
		public void Paint(Graphics g)
		{
			g.drawLine(0, 100, 200, 300);
		}
	}
	

}
