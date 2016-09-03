package tw.jacky.jackyjava;

public class Jacky26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1=new String();
			String s2=new String(new byte[]{97,98,99,100});
			String s3="hello world";  // JVM 執行new 動作
			String s4=new String("hello world");
			System.out.println(s1+":"+s2); //為什麼s2不是出現位置
			System.out.println(s1.length()); //字串是塞給內容 需透過方法才能算出長度
											 //陣列是 int[4] 屬性...	
			
			System.out.println("Hello world".length()); //"" 內就是一個字串物件
			
			
	}
}
