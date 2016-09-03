package tw.jacky.jackyjava;

import javax.swing.JFrame;

public class Jacky08 extends JFrame {
	
	public Jacky08()
	{
		super("Jacky App");
		setSize(320,480);
		setVisible(true);
	 			
	}
	 
	public static void main(String[ ] args)
	{
	
		new Jacky08();
		
		//int a=10;
		
		byte a=10;
		final int b=9;
		
		
		
		//先看語法結構
		switch(a) //byte,int,short,char
		{
			case 1: 
				System.out.println(a);
				break;
			case 10: 
				System.out.println(a);
				break; //break 敘述句拿掉， case b+2 對判斷只是一個執行敘述句，不是比對敘述句
						//做了也沒用，直接跳Ｂ1
			case b+2: 
				System.out.println("B1");
				// ok
				break;
			
//			case b+1:
//				 break  ==>10 重複ＮＧ
		    default:		
		    	System.out.println(a);
				break;		
		 
		}
				
		
	}

}
