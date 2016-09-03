package tw.jacky.jackyjava;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Jacky53 {
	
	public static void main(String[] args) {
		int a=123;
		boolean b=true;
		double c=12.3;

		
		// TODO Auto-generated method stub
			try {
				DataOutputStream dout=new DataOutputStream(
						new FileOutputStream("dir1/data.dat"));
//				dout.writeInt((int)(Math.pow(2, 64)/2));
				dout.writeInt(a);
				dout.writeBoolean(b);
				dout.writeDouble(c);

				
				dout.flush();
				dout.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
