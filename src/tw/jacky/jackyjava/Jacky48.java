package tw.jacky.jackyjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//專讀文字內容
public class Jacky48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("dir1/Jacky.txt"); 
		try {
			//源頭是input stream
			FileReader reader=new FileReader(f1);
			int c;
			while ((c=reader.read())!=-1)
			{
				System.out.print((char)c);
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
 		 		
	}

}
