package tw.jacky.jackyjava;

import javax.swing.JOptionPane;

// while 語法
public class Jacky23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String sinput=JOptionPane.showInputDialog("Input Dialog");
		int n=Integer.parseInt(sinput);
		int v=0;
		while(i<n)
		{
			//v=v+n;
			//n--;
			v+=n--;
		}
		System.out.println(v);
		
		
	}

}
