package tw.jacky.jackyjava;

import javax.swing.JOptionPane;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] unit={"仟","佰","拾","億","仟","佰","拾","萬","仟","佰","拾","元"};	
		String input=JOptionPane.showInputDialog("請輸入金額");
 		int diff=unit.length-input.length();
 		System.out.println(input.length()+":"+diff);
 		int k=0;
 		for(int i=diff;i<unit.length;i++)
		{
			System.out.print(((input.charAt(k)!='0')?input.charAt(k):"")+unit[i]);
			k++;	
		}
		
	}

}
