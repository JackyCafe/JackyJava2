package tw.jacky.jackyjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//
public class Jacky57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jacky573 obj=new Jacky573();
		
		try {
			ObjectOutputStream oot=new ObjectOutputStream(new
					FileOutputStream("dir1/Jacky57"));
			
			oot.writeObject(obj);
			oot.flush();
			oot.close();
			System.out.println("ok 1");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		System.out.println("----------------");
		//  解序列化的過程中看祖宗八代誰沒有會幫他完成
		try {
			ObjectInputStream oin=new ObjectInputStream(new FileInputStream("dir1/Jacky57"));
			oin.readObject();
			oin.close();
			System.out.println("ok 2");

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}

}

class Jacky571  {
	Jacky571(){
		System.out.println("Jacky571");
	}
}

class Jacky572 extends Jacky571  {
	Jacky572(){
		System.out.println("Jacky572");
	}
}

class Jacky573 extends Jacky572 implements Serializable
{
	Jacky573(){
		System.out.println("Jacky573");
		}

}