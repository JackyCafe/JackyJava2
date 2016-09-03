package tw.jacky.jackyjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//Jacky34 的物件實體 is a JFrame,is a Container....
//Window 只是框框，按下去要做什麼事JFrame 
public class Jacky34 extends JFrame implements ActionListener {

	private JButton open, save, exit;
	private JTextArea textArea;

	// 不寫建構式 JFrame（） 為建構式
	// 但會無法知道屬性.....
	public Jacky34() {
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

		//
		// JPanel bottom=new JPanel(new BorderLayout());
		textArea = new JTextArea();
		// bottom.add(textArea);
		// add(bottom,BorderLayout.CENTER);
		add(textArea, BorderLayout.CENTER);
	    //安著set的原因是只能有一個Listener
		open.addActionListener(this);
		//MyListener 如果內部類別與外部類別均有時
		//呼叫內部類別先
		//認證 要注意
		open.addActionListener(new MyListener());
		//越後面add的 越先出來
		open.addActionListener(new tw.jacky.jackyjava.MyListener());
		//最常用的招數，當場在此時做一個ActionListener
		open.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doOpen();
			}});
		
		
		save.addActionListener(this);

		setSize(640, 480);
		setVisible(true);
		// 按ＸＸ時尚未從記憶體結束,除非執行defaultCloseOperation
		// EXIT_ON_CLOSE,定義在JFrame...static 方法
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void doOpen()
	{
		System.out.println("InnerListener");
		
	}
	
	// 執行時期會預先載入
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jacky34();
	}

	// 內部類別設計一個會聽的人
	// 內部類別方便存取外部類別的方法
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				System.out.println("My Listener 2");
		}
	}
	
	
	// ActionListener 必須考actionPerformed 這張證照
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// if(open.equals(e.getSource))
		if (e.getSource().equals(open)) {
			System.out.println("open");
		}
		if (e.getSource() == save) {
			System.out.println("save");
		}

		System.out.println("ok" + e.getActionCommand());
	}

}

// 適用多類別同時取用
// 設計一個會聽的人
class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			System.out.println("My Listener 1");
	}
}