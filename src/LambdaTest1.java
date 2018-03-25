
public class LambdaTest1 {
	public static void main(String[] args) {
		//	Test1 obj = new Test12();
		//	fun(obj);
	/*	fun(new Test1() {
			@Override
			public int m1(int a,int b) { 
				return a*a+2*a*b+b*b;
			}
		}) ;*/
		fun((a,b)->a*a+2*a*b+b*b);
		
		
	}
	
	static void fun(Test1 obj) {System.out.println(obj.m1(1, 3));}
}
