package tw.jacky.jackyjava;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jacky66 extends JFrame{
    MyPainter painter;		
    JButton clear,unDo,reDo,save;
	public Jacky66()
	{
		super();
		setLayout(new BorderLayout());
		painter=new MyPainter();
		
		clear=new JButton("clear");
		unDo=new JButton("un do");
		reDo=new JButton("re do");
		save=new JButton("Save");
		
		
		JPanel top= new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);
		top.add(unDo);
		top.add(reDo);
		top.add(save);
		add(top,BorderLayout.NORTH);
		add(painter,BorderLayout.CENTER);

		setupEvent();
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
 		
	}

	private void setupEvent() {
		// TODO Auto-generated method stub
			clear.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub	
					doClear();
				}});
			
			unDo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					doUndo();
				}
			});
			
			reDo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					doRedo();
				}

						});
			
			save.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					doSave();
 				}
			});
	
	}

	
	protected void doSave()
	{
		BufferedImage bi=new BufferedImage(painter.getWidth(), painter.getHeight(), BufferedImage.TYPE_INT_ARGB);;
		Graphics g=bi.createGraphics();
		painter.paint(g);
		g.dispose();
		try {
			ImageIO.write(bi, "png", new File("dir1/test.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
		
	}
	
	
	protected void doUndo() {
		// TODO Auto-generated method stub
		painter.undo();
	}

	private void doClear() {
		// TODO Auto-generated method stub
		painter.clear();
	}
	 
	private void doRedo() {
		// TODO Auto-generated method stub
		painter.redo();
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Jacky66();
	}

}
