package tw.jacky.jackyjava;

import java.io.File;
import java.io.IOException;

public class Jacky44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(File.separator);
			System.out.println(File.pathSeparatorChar);
			
			File f1=new File("c:\\king"); //無無傳參數建構式，所以給一個空白字串的參數
									     // c:\king ==>無效的跳多字元 
										 // 只要看到斜線 就以為是跳脫字元,用兩根斜線來處理
									     // 編譯失敗		
			
			File f2=new File("c:\\test");  //編譯成功
			File f3=new File("c:/test");  //編譯成功 ，斜另外一邊也ＯＫ
			
			
//			  
			File f4= new File("./dir1/Jacky02.txt");   // 可以寫 dir1
			System.out.println(f4.exists()?"ok":"xx");
			try {
				System.out.println(f4.isFile()?"ok":f4.createNewFile());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
	}

}
