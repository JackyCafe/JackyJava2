package tw.jacky.jackyjava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Jacky60 {

	//receiver
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String data="Hello Jacky";
//		byte [] sendData =data.getBytes();
		try {
			//需指定ＰＯＲＴ
			while(true){
				DatagramSocket socket =new DatagramSocket(8888);
				byte[] buf=new byte[1024];
	//			socket.close();
				//封包的sender建構式要指定位置與ＰＯＲＴ
				
				DatagramPacket packet=new DatagramPacket(buf,buf.length); 
				socket.receive(packet);
				InetAddress urip=packet.getAddress();
				byte[] data=  packet.getData();
				int len=packet.getLength();
				System.out.println("receive ok "+urip+":"+new String(data,0,len));
	 			socket.close();
			}
			
		} catch (SocketException e) {
			//port  被佔用
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
		
	}

}
