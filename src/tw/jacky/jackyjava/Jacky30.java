package tw.jacky.jackyjava;

public class Jacky30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Jacky301 obj1=new Jacky301();
//		Jacky301 obj2=new Jacky301(1);
//		Jacky301 obj3=new Jacky301((byte) 2);
		Jacky301 obj4=new Jacky301((short) 2);
		Jacky302 obj5=new Jacky302();
		Jacky302 obj6=new Jacky302(1);
		Jacky302 obj7=new Jacky302("1");
		

	}

}

class Jacky301 extends Object
{
	//overload
//	Jacky301()
//	{
//		System.out.println("A");
//	}
	Jacky301(int a)
	{
		System.out.println("B");
		
	}
	Jacky301(byte a)
	{
//		System.out.println("C");
		
	}
}

//任何類別沒有建構式,編譯時期會以父類別的無傳參數建構子
//
class Jacky302 extends Jacky301
{   
	// 建構式中第一道會呼叫父類別的無傳參數建構子
	// 只要能產生實體，祖宗八代都在記憶體中了
	Jacky302()
	{
//		super(); 301 無無傳參數建構子
		super(1);
		System.out.println("Ｄ");
		
	}
	

	Jacky302(int a)
	{
		this(); //呼叫302的建構式
		System.out.println("Ｅ");

	}
	
	Jacky302(String b)
	{
//		System.out.println("E"); <==this/super要放第一句，不寫就是super
		this(1); //呼叫傳int 的建構式
		System.out.println("Ｆ");

	}
}
// class 
// 一個java 只能有一個 public 