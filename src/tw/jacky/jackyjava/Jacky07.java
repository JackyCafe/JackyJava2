package tw.jacky.jackyjava;

// 宣告有一個類別 class  全世界都可以用，
public class Jacky07 {
	
	
	//宣告有一個方法 全世界可以用，開啟時載入記憶體．
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=3;
		//--a 
//		System.out.println(--a); //==>9  先做-1
//		System.out.println(a--); //==>10 ,這次運算先用現在的值，印完再做-1
//		System.out.println(a); 
		
		
		if(--a>=10 && b++<=3)
		{
			System.out.println("OK a="+a +",b="+b);
		}
		else
		{
			System.out.println("NG a="+a +",b="+b); //9,3

		}
		
		a=10;
		b=3;
		
		if(--a>=10 & b++<=3)
		{
			System.out.println("OK a="+a +",b="+b);
		}
		else
		{
			System.out.println("NG a="+a +",b="+b); //9,4

		}
		
		
		//
		a=10;
		b=3;
		int c=a&b;
		System.out.println(c);
		
	}
	
	

}
