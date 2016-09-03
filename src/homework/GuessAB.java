package homework;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessAB extends JFrame implements ActionListener{
	private JButton guessBtn;
	private JTextField edit;
	private JTextArea area;
	private String answer,guess,mesg;
	int count=0;
	public GuessAB()
	{
		answer=createAnswer(4);
		mesg="";
		setLayout(new BorderLayout());
		JPanel top=new JPanel(new FlowLayout(FlowLayout.LEADING));
		guessBtn=new JButton("猜") ;
		
		edit=new JTextField(20);
		area=new JTextArea();
//		edit.setSize(200,20);
		top.add(edit);
		top.add(guessBtn);
		add(top,BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
		guessBtn.addActionListener(this);

		boolean isWinner=false;
		 		
		setSize(480,320);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GuessAB();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		String 
		System.out.println(answer);
 		guess=edit.getText();
 		count++;
 		mesg+=guess+":"+checkAB(answer,guess)+"\n";
		area.setText(mesg);
		edit.setText("");
		if(count==10)
			JOptionPane.showMessageDialog(area, "你是魯蛇 ");
		

		
		if(guess.equals(answer)){
//				isWinner=true;
				JOptionPane.showMessageDialog(area, "恭喜老爺 賀喜夫人 ");
				 
			} 
		
		 
				
	}

	private String createAnswer(int n) {
		 int[] ans=new int[10];
		 int temp;

		 for (int i=0;i<10;i++)
		 {
			 ans[i]=i;
		 }
		 int rand;
 
		 for(int i=ans.length-1;i>0;i--)
		 {
			 rand=(int)(Math.random()*i);
  			 temp=ans[rand];
			 ans[rand]=ans[i];
			 ans[i]=temp;
		 }
		 String ret="";
		for(int i=0;i<n;i++)
			ret+=ans[i];
		 
		 return ret;
	}


	 String checkAB(String ans,String guess){
		int A,B;A=B=0;
		for(int i=0;i<guess.length();i++)
		{
			if(ans.charAt(i)==guess.charAt(i))
			{
				A++;
			}else if(ans.indexOf(guess.charAt(i))!=-1)
			{
				B++;
			}
				 
		}
		return A+"A"+ B+"B";
	}
	
	
	
}
