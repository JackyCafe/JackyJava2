package tw.jacky.jackyjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FtpServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket server=new ServerSocket(6666);
			System.out.println("before");
			Socket socket=server.accept(); //回應三方交握
			InetAddress urip=socket.getInetAddress();
			System.out.println("after");
			InputStream fin=socket.getInputStream();
			byte[] b=new byte[4096];
			int c;  
			BufferedInputStream bin=new BufferedInputStream(socket.getInputStream());
			BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("download/golf.jpg"));
			
			while ((c=bin.read())!=-1)
			{
				bout.write(c);
				
			}
			
			bin.close();
			bout.flush();
			bout.close();
			server.close();

		}catch(Exception e) {
			
		}
		 
			
 
	}

}
