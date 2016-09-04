package tw.jacky.jackyjava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Jacky59 {

	//sender
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			while(true){
			i++;
			String data="Hello Brad"+i;

			byte [] sendData =data.getBytes();


			DatagramSocket socket =new DatagramSocket();
//			socket.close();
			//封包的sender建構式要指定位置與ＰＯＲＴ
			
//			DatagramPacket packet=new DatagramPacket(sendData,sendData.length,
//					InetAddress.getByName("10.2.24.106"),8888); 

			DatagramPacket packet=new DatagramPacket(sendData,sendData.length,
					InetAddress.getByName("10.2.24.147"),8888); 
			socket.send(packet);

//			System.out.println("Send ok");
			 
			}
			
		} catch (SocketException e) {
			//port  被佔用
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(UnknownHostException e)
		{
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
		
		
	}

}
