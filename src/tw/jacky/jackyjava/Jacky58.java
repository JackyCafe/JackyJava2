package tw.jacky.jackyjava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Jacky58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			InetAddress ip=InetAddress.getByName("www.microsoft.com"); //主機名稱或ip address
			InetAddress [] ips=InetAddress.getAllByName("www.facebook.com"); 
			//如果是輸入ip 是檢查ip的合理性
//			System.out.println(ip.getAddress());
			for(InetAddress ip:ips)
			System.out.println(ip.getHostAddress());

		} catch (UnknownHostException e) {
			
 			e.printStackTrace();
		}
	}

}
