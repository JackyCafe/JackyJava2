package tw.jacky.jackyjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Jacky47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("dir1/Jacky.txt"); 
		try {
			FileInputStream fin =new FileInputStream(f1) ; //相當於open file
			int c=fin.read();
//			System.out.println(c);  //印出來為ＡＳＣＩＩ
//			System.out.println((char)c);   			
 			
			// 整個括號會以c!=-1 來運算
			// 文字檔不適合用這招，中文解讀有問題，一個中文字2個byte
			// UTF-8 以2^24來存放字元
			byte[] b=new byte[3]; 
			
			//準備一個3byte 的臉盆來read 裝
			//最後一個 byte剩c
			while ((c=fin.read(b))!=-1) 
 			{
// 				System.out.print((char)c);   	
				System.out.print(new String(b,0,c));
 				}
			
			//招數二 int 2G
			long len=f1.length();
			byte[] bb=new byte[(int)len];
			while((c=fin.read(bb))!=-1 )
			{
				System.out.println(new String(bb,0,c));
			}
			
			
			fin.close();									// 有開有關
			System.out.println("ok");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}

}
