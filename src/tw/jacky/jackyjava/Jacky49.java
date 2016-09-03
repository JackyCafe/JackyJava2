package tw.jacky.jackyjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
//專讀文字內容
public class Jacky49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("dir1/Jacky03.txt"); 
		 
		try {
			//如果加上append 指標會指到最後一筆
			FileOutputStream fout=new FileOutputStream(f1,true);
			//String.getByte 字串轉成byte陣列傳送
			//cursor 指到指標源頭，蓋掉它
			//在window 系統用/r/n ==>記事本看就很清楚了
			
			fout.write("Hello Jacky 肚子餓了\n".getBytes());	
			//沒有fout.append 這一招
			fout.flush();
			fout.close();
			System.out.println("ok");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
 		 		
	}

}
