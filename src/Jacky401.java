
public class Jacky401 {

	// 任何一隻Java 皆由main thread 開始
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//run time exception 編譯時期可以不執行
		int a=10,b=0;
		int[] c={1,2,3};
		try {
			System.out.println(a/b);
			System.out.println(c[3]); //上一句例外拋出了,這一句不會被執行
			//執行階段 有一個超出範圍的例外
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("範圍的例外");

		}
		
		
		catch(ArithmeticException ae)
		{
		// 	
//		//只要有捕捉，有方塊處理就是有處理
		System.out.println("Jacky");
	    }
		
		
		catch(RuntimeException e){
			System.out.println("Big");
		}
		//處理完了 沒事繼續跑程式
		//有事情沒處理 就會拋出
		System.out.println("Ok");
				
	}

}
