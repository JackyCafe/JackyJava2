package tw.jacky.jackyjava;

public class Jacky43 {

	//呼叫的堆疊
	// main 方法拋出給ＪＶＭ處理，一般不會這樣做
	// 通常需要處理
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jacky433 obj=new Jacky433();
		try {
			obj.m3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Jacky431 {void m1() throws Exception{
	throw new Exception();
}}
class Jacky432 extends Jacky431{
	void m2() throws Exception{
		m1();
	}
}
class Jacky433 extends Jacky432{
	void m3() throws Exception {
		m2();
	}
}

