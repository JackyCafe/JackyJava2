package tw.jacky.jackyjava;

//存取修飾字 public ,protected,沒有,private
// public ==>   全世界
// protected ==>相同package都可以存取，繼承之子類別
//           ==>相同package都可以存取
// private ==>本類別

public class Jacky38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Jacky381 {
	void m1(){ };
    private void m2() {}; //爸爸已經private 了，兒子叫不到override
}

//override
//extends ==>發揚光大
class Jacky382 extends Jacky381{
	
	//private void m1() ==>error
	// override 只看方法名稱 參數個數，參數型別，不看存取修飾字
 protected void m1(){}; //父類別沒有宣告存取修飾字，override 可用 protected
void m2(){};
 
}