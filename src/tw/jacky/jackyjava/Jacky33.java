package tw.jacky.jackyjava;

public class Jacky33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jacky332 obj1=new Jacky332();
//		obj1.m1();
		obj1.m1(3);
//		obj1.m2();
	}

}

class Jacky331 {
	int a;
	void m1() {
		a++;
		System.out.println("Jacky 331 :m1() a"+a);}
}

class Jacky332 extends Jacky331 {
	int a=99;
	//override
//	void m1() {
//		System.out.println("Jacky 332 :m1()");
//		super.m1(); //通常放第一行，但不一定放第一行
//		
//	}
	//overload
	void m1(int a){
		super.m1();
		a++;
		System.out.println("Jacky 332 :m1(int) a"+a);
		System.out.println("Jacky 332 :m1(int) this a"+this.a++) ;
		System.out.println("------------");
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(a);
		
		
	}

	void m2() {System.out.println("Jacky 332 :m2()");}
}