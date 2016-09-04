package tw.jacky.jackyjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server=new ServerSocket(7777);
			System.out.println("before");
			Socket socket=server.accept(); //回應三方交握
			InetAddress urip=socket.getInetAddress();
			System.out.println("after");
			InputStream fin=socket.getInputStream();
			byte[] b=new byte[4096];
			int c;  
//			while ((c=fin.read(b))!=-1)
//			{
//				System.out.print(new String(b,0,c));
//
//			}
			InputStreamReader reader=new InputStreamReader(fin)	;
			BufferedReader br=new BufferedReader(reader);
			StringBuilder sb=new StringBuilder();
			while((c=br.read())!=-1)
			{
				sb.append(br.readLine());
//				sb.append((char)c);
			}
			
			server.close();
			System.out.println(sb.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
