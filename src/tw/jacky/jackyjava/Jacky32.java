package tw.jacky.jackyjava;

public class Jacky32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Jacky321.m1();
//		Jacky321.m1();
//		Jacky321.m1();
//		Jacky321 obj1= new Jacky321(); //new 時 物件已經存在，new 後面決定初始化的方式
		
		Jacky323 obj2= new Jacky323();
		
	}
}
	class Jacky321
	{
		int a=12;
		//物件程式區塊 跟著物件走
		// static 的屬性的東西 早就被載入先了
		static {
 			System.out.println("Jacky321 {} static:");
		}
		

		{
			a++;
			System.out.println("Jacky321 {} :"+a);
		}
		
		Jacky321(){
			System.out.println("Jacky321()");
			}
		//普通方法都有return，不傳回用void
		//Java 傳回作業系統 System.exit(status)
		static void m1()
		{
			System.out.println("Jacky321:m1()");
		}
	}
	
	class Jacky322 extends Jacky321{
		
		Jacky322()
		{
			//super
			System.out.println("Jacky322()");
			
		}
	}
	
	class Jacky323 extends Jacky322{
		Jacky323()
		{
			//super 編譯時期拿父類別來用，沒有繼承概念
			//方法跟屬性才有繼承概念
			System.out.println("Jacky323()");
			
		}
		 	
	}

