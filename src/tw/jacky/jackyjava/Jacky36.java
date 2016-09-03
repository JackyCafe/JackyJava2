package tw.jacky.jackyjava;

public class Jacky36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // 記憶體配置一個String pool 給String
		   // 程式看到雙引號， 馬上做出來
			String a="Jacky"; //看到a 的雙引號 馬上指到 String pool
			String b="Jacky"; //看到b..的雙引號 馬上指到 String pool
			String c=new String("Jacky");
			String d=new String("Jacky");
			
			//a & b 都是物件，用＝＝比 是在問參考address 是否一樣
			if(a==b) System.out.println("a b OK");
			else System.out.println("XX");
			
			//a & b 都是物件，用＝＝比 是在問參考address 是否一樣
			if(c==d) System.out.println("c d OK");
			else System.out.println("c d XX");
			
			//String override equal 方法
			if(a.equals(c)) System.out.println("a c OK");
			else System.out.println("XX");
			
			
			
	}

}
