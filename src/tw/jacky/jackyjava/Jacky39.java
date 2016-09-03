package tw.jacky.jackyjava;

public class Jacky39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Jacky391 obj1=new Jacky391();
//			Jacky392 obj2=new Jacky392(); 肚子不清不楚 不能宣告

			//我想要一台toyota車子，toyota 做給我
			Jacky393 obj3=new Jacky393();
			
			//我想要一台車子，toyota 做給我
			//obj2 的眼中只是一台車子，看不到m3方法
			//我只要一台車 turbo 方法
			Jacky392 obj2=new Jacky393(); //宣告為392,但是由393做出來的
			
			Jacky393 obj4=(Jacky393) obj2; //轉型回來Jacky的所有方法都能用
			//轉型會有轉型失敗，編譯成功，執行時期error
			obj4.m3();
			
			
			
	}

}
	class Jacky391{
		void m1(){}
	}


	//介面是所有方法都是抽象方法
	//肚子裡面只要有一個 抽象方法，類別就必須宣告為抽象類別
	//肚子內可以沒有抽象方法，但宣告為抽象類別
	//等待一個實作抽象方法的子類別
	//一個抽象類別無法直接產生物件實體,但可有一個建構式提供給子類別使用
	//沒有抽象方法但卻宣告為抽象類別，其目的在於期待子類別轉型
	abstract class Jacky392{
		//抽象類別
		public Jacky392() {
			System.out.println("Jacky392()");
		}
		void m1(){			System.out.println("Jacky392:m1()");
}
		abstract void m2();// 沒有大括號
	}

	
	//兩個方法
	//繼續抽象類別
	//實作m2 方法
	class Jacky393 extends Jacky392
	{

		@Override
		void m2() {
			// TODO Auto-generated method stub
			System.out.println("Jacky393:m2()");

		}
		
 		void m3() {
			// TODO Auto-generated method stub
			System.out.println("Jacky393:m3()");

		}
	}
	
	//final 與 abstract 完全衝突
	//通常會基於安全性的考量 final
	final class Jacky394{
		
	}
