package tw.jacky.jackyjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//Jacky34 的物件實體 is a JFrame,is a Container....
//Window 只是框框，按下去要做什麼事JFrame 
public class Jacky51 extends JFrame {

	private JButton open, save, exit;
	private JTextArea textArea;
	File openFile;

	// 不寫建構式 JFrame（） 為建構式
	// 但會無法知道屬性.....
	public Jacky51() {
		super("My Window App");

		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");

		// 請室內設計師幫忙實作, 室內設計師只要有證照
		// setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);
		top.add(save);
		top.add(exit);
		add(top, BorderLayout.NORTH);

		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doOpen();
				readFile();
			}
		});

		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doSave();
			}
		});
		
		//
		// JPanel bottom=new JPanel(new BorderLayout());
		textArea = new JTextArea();
		// bottom.add(textArea);
		// add(bottom,BorderLayout.CENTER);
		JScrollPane jsp=new JScrollPane(textArea);
		
		add(jsp, BorderLayout.CENTER);
		// 安著set的原因是只能有一個Listener

		setSize(640, 480);
		setVisible(true);
		// 按ＸＸ時尚未從記憶體結束,除非執行defaultCloseOperation
		// EXIT_ON_CLOSE,定義在JFrame...static 方法
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void doOpen() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			openFile = jfc.getSelectedFile();
		}
		
	}
	
	public void readFile(){
		try {
			FileReader reader=new FileReader(openFile);
 			int c;
 			while ((c=reader.read())!=-1)
 			{
 				textArea.append(""+(char) c) ;
 			}
			
			
			
			reader.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void doSave()
	{
	  if(openFile!=null)
	  {
		  try {
			FileWriter writer=new FileWriter(openFile);
			writer.write(textArea.getText());
			 
			writer.flush();
			writer.close();
			JOptionPane.showConfirmDialog(this, "儲存完成");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
		
		
		
	}

	// 執行時期會預先載入
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jacky51();
	}

}