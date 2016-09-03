package tw.jacky.jackyjava;

 
public class Jacky35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jacky352 t1=new Jacky352();
		Jacky353 t2=new Jacky353();
		Jacky354 o1=new Jacky354();
		o1.m1(t1);
		o1.m1(t2);

	}
}
	interface Jacky351 {
		// 只是個規格，應該要會，怎麼做各自努力
		// 介面的存取修飾字 public
		void m1();

		void m2();
	}

	// 定義，宣告
	class Jacky352 implements Jacky351 {

		// 看到大括號就是有實作
		// Java 介面的存取修飾字必須為public
		// 實作方法的存取修飾字範圍不能比他小
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println("Jacky 352:m1()");
		}

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			System.out.println("Jacky 352:m2()");

		}

		void m3() {
			System.out.println("Jacky 352:m3()");

		}

	}

	// 定義，宣告
	class Jacky353 implements Jacky351 {

		// 看到大括號就是有實作
		// Java 介面的存取修飾字必須為public
		// 實作方法的存取修飾字範圍不能比他小
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println("Jacky 353:m1()");

		}

		@Override
		public void m2() {
			// TODO Auto-generated method stub
			System.out.println("Jacky 353:m2()");

		}

		void m4() {
			System.out.println("Jacky 353:m4()");

		}

		

	}
	class Jacky354 {
		void m1(Jacky351 obj1) {
			obj1.m1();
			obj1.m1();
		}
	}