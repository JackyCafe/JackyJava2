package tw.jacky.jackyjava;

public class Jacky37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//d 為區域變數
		final int d;
		d=12;
//		d=12;
		System.out.println(Jacky376.a);
	}

	interface Jacky371 {
		void m1();
	}

	interface Jacky372 {
		void m2();
	}

	//
	class Jacky373 implements Jacky371, Jacky372 {

		@Override
		public void m2() {
			// TODO Auto-generated method stub

		}

		@Override
		public void m1() {
			// TODO Auto-generated method stub

		}

	}

	//介面可以繼承介面 也只能繼承． everything is public
	interface Jacky374 extends Jacky371
   {
//		int a;  介面屬性在宣告的同時 必須給值，因為沒機會初始化
		
	   void m3();
   }

   interface Jacky375 extends Jacky371,Jacky372{
	   int a=10;    //public static final
	   void m3();
   }

   class Jacky376 implements Jacky375
   {
	   int b;
	   final int c;  //沒初始化
	   
	   //只能在宣告時給值 或在建構式中給值
	   Jacky376(){
		   c=12;   //宣告時沒給值，建構式中沒給值會出現
		   		   //會出現編譯時期Error	
	   }
	   
	   
		@Override
		public void m1() {
			// TODO Auto-generated method stub
		   b++;
//		   a++;編譯時期錯誤，介面的屬性會被宣告public final
 		}
	
		@Override
		public void m2() {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void m3() {
			// TODO Auto-generated method stub
			
		}
	}
   
   
}
