package tw.jacky.jackyjava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Socket socket=new Socket(InetAddress.getByName("10.2.24.106"),7777);
//			Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),7777);
			Socket socket=new Socket(InetAddress.getByName("10.2.24.147"),7777);
				
			OutputStream out=socket.getOutputStream();
			out.write("Hello 你好 11  Hello 你好 12  Hello 你好 13 Hello 你好 14  Hello 你好 15  Hello 你好 16".getBytes());
			out.flush();
			out.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
