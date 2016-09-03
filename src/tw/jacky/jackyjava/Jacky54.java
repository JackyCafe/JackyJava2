package tw.jacky.jackyjava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Jacky54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DataInputStream din=new DataInputStream(
					new FileInputStream("dir1/data.dat"));
			
			//順序要跟檔案的格式一樣
			int a=din.readInt();
			Boolean b=din.readBoolean();
			double c=din.readDouble();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			
			din.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
		
	}

}
