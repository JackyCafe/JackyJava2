package homework;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	private JButton[] btn=new JButton[10];
	private JTextField result;
	String a,b,oper;
	String first="";
	String second="";
	
	
	public Calculator()
	{
		super("我的計算機");
		
		JPanel top=new JPanel(new BorderLayout());
		result=new JTextField(20);
		top.add(result);
		add(top,BorderLayout.NORTH);
		JPanel bottom =new JPanel(new GridLayout(4,3));
		for(int i=2;i>=0;i--)
		{
			for(int j=1;j<=3;j++){
			btn[i*3+j]=new JButton(""+(i*3+j));
			bottom.add(btn[i*3+j]);}
		}
		JButton empty=new JButton();
		bottom.add(empty);
		btn[0]=new JButton("0");
		bottom.add(btn[0]);
		JButton enter=new JButton("enter");
		bottom.add(enter);
		add(bottom,BorderLayout.CENTER);
		
		JPanel right=new JPanel(new GridLayout(4, 1));
		JButton plus=new JButton("+");
		JButton minus=new JButton("-");
		JButton mutil=new JButton("*");
		JButton div=new JButton("/");
		right.add(plus);
		right.add(minus);
		right.add(mutil);
		right.add(div);
		
		add(right,BorderLayout.EAST);
		for(int i=0;i<10;i++)
			btn[i].addActionListener(this);
	
		plus.addActionListener(this);
		minus.addActionListener(this);
		mutil.addActionListener(this);
		div.addActionListener(this);
 		enter.addActionListener(this);
		
		setSize(320,280);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Calculator();
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Boolean isOper=false;
		float ans=0;
		
		String regex="^[+-/*e]$";
		a=result.getText();
		b=result.getText();
//		 	if(e.getActionCommand()!="enter" && e.getActionCommand()!="+"
//			&& e.getActionCommand()!="-" && e.getActionCommand()!="*"
//			&& e.getActionCommand()!="/")
			if(e.getActionCommand()!="enter"&&!e.getActionCommand().matches(regex))
			{
				if(!isOper) {
					a+=e.getActionCommand();
					result.setText(a);
			}else{
				b+=e.getActionCommand();
				result.setText(b);
			}
		
			
			}
			if(e.getActionCommand().matches(regex))
			{
				System.out.println("here");
				first=result.getText();
				oper=e.getActionCommand();
	 		    isOper=true;
				result.setText("");

			}
		if(e.getActionCommand().equals("enter")){
			second=result.getText();
//			System.out.println(first+":"+second);
  		switch(oper){
		case "+" : ans=Float.parseFloat(first)+Float.parseFloat(second); break;
		case "-" : ans=Float.parseFloat(first)-Float.parseFloat(second); break;
		case "*" : ans=Float.parseFloat(first)*Float.parseFloat(second); break;
		case "/" : ans=Float.parseFloat(first)/Float.parseFloat(second); break;
			}
		 result.setText(""+ans);	
		}
		
		
	}

}
