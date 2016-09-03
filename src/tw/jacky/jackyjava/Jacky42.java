package tw.jacky.jackyjava;

import java.beans.PropertyVetoException;
import java.lang.instrument.IllegalClassFormatException;
import java.rmi.NotBoundException;

import javax.xml.datatype.DatatypeConfigurationException;

public class Jacky42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new Bird();
		// b1.setLeg(3); ==>自行定義拋出runtime Exception
		try {
			b1.setLeg(3);
		} catch (RuntimeException e) {
			System.out.println("xxxxx");
		}
		System.out.println(b1.leg);

		Jacky421 obj1 = new Jacky421();
		// 人家已經先告知會有什麼風險
		// 所以 要先預防...try catch...
		try {
			try {
				obj1.m1(100);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}
}

// 撰寫類別的人不處理，拋出例外交由開發者處理
// 這是一種設計時期的彈性
class Bird {
	int leg;

	void setLeg(int n) {
		if (n < 0 || n > 2) {
			throw new RuntimeException();
		}

		leg = n;
	}

}

class Jacky421 {
	void m1(int n) throws DatatypeConfigurationException, NotBoundException, PropertyVetoException {
		if (n < 0)
			throw new DatatypeConfigurationException();
		else if (n > 100)
			throw new NotBoundException();
	}

}

class Jacky422 extends Jacky421 {
	// 發揚光大，壞事不能比爸爸多...甚至沒有
	void m1(int n) {
		int a=10,b=0;
		try{
			int c=a/b;
			return;
		}catch(Exception e){}
		finally{
			//最後收尾都要來這邊集合
			//即始想要先return 都要先來簽名
			//常用 IO/database/Network close...
			//新版有一個AutoCloseable Exception 
			System.out.println("finally");
		}
		System.out.println("Ok");
	
	}
	

}