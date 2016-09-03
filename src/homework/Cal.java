package homework;

import javax.swing.JOptionPane;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		int [] days_in_month={31,28,31,30,31,30,31,31,30,31,30,31};
		String [] days_in_week={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int total_days=0;
		int year,month;
	    year=Integer.parseInt(JOptionPane.showInputDialog("請輸入年"));		
	    month=Integer.parseInt(JOptionPane.showInputDialog("請輸入月"));
		
		
		
		boolean is_leap_year =false;
		
		
		//算自1970~year/1/1共幾天
		for(int i=1970;i<year;i++){	
			is_leap_year=check_leap(i);
			//2月28天還是29天
			days_in_month[1]=is_leap_year?29:28;

		
			for(int d :days_in_month)
			{
				total_days+=d;
			}
		} //end of year
		
		// 算輸入的日期2月有幾天
		is_leap_year=check_leap(year);
		days_in_month[1]=is_leap_year?29:28;

		// 陣列偏移-1 
		// 當月天數不算再-1 
		for (int j=0;j<=(month-2);j++)
		{
			total_days+=days_in_month[j];
		}
		
 		
		for(String s:days_in_week)
		System.out.print(s+"\t");
		System.out.println(); 
 		   
		int diff=(4+total_days)%7; //補空格   
 		
 		for(int i=0;i<diff;i++)
		{System.out.print("  "+"\t");}
		for(int i=1;i<=days_in_month[month-1];i++)
		{
			if((diff+i)%7==0)
			{
				System.out.println(i+"\t");
 			}else{
				System.out.print(i+"\t");
			}
		}
		
		
		
		
	}

	
	
	public static boolean check_leap(int year)
	{
		boolean is_leap=false;
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					is_leap=true;
				}else{
					is_leap=false;
				}
			}else{
				is_leap=true;
			}
		}else{
			is_leap=false;
		}
		 	 
		return is_leap;
		 	
	}
}