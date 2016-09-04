import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.net.Socket;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

public class FtpClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start=System.currentTimeMillis();

		Socket client;
		OutputStream out;
		
		//1. Read from Local System
		
		
		File file=new File("upload/golf.jpg");
		byte[] sendBuf=new byte[(int) file.length()];
		try {
			  client=new Socket("10.2.24.147", 6666); //三方交握
			  out=client.getOutputStream();  //取得輸出串流
			  BufferedOutputStream bout=new BufferedOutputStream(out);
			  
			BufferedInputStream bin =new BufferedInputStream(
						new FileInputStream(file));//讀取檔案
			int b;
			bin.read(sendBuf);
			out.write(sendBuf);
//			while ((b=bin.read())!=-1)
//			{
//				out.write(b);
//			}
			
			bout.flush();
			bout.close();
			bin.close();
			client.close();
		
			System.out.println("Send OK");
			System.out.println(System.currentTimeMillis()-start);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			e.printStackTrace();
		}
				
		
		
	}

}
