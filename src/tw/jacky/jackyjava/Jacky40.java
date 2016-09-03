package tw.jacky.jackyjava;

public class Jacky40 {
//轉型
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jacky401 obj1 =new Jacky401();
		Jacky402 obj2 =new Jacky402();
		Jacky401 obj3 =new Jacky402();
		
		obj1.m1();
		obj2.m1();
		
		//有沒有方法看宣告，能不能執行 看骨子裡的東西 Jacky402
		obj3.m1(); //可已有401 m1方法，但執行的是402m1方法
		//error
//		obj3.m2();
		
//	    
//		Jacky402 obj4 =new Jacky401();


		
	}
}
	
class Jacky401{
	int a=1;
	void m1() {System.out.println("Jacky401:m1() a:"+a);}
}


class Jacky402 extends Jacky401{
	int a=2;
void m1() {System.out.println("Jacky402:m1():a:"+a);}
void m2() {System.out.println("Jacky402:m2():");}

}


