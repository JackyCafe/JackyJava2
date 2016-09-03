package tw.jacky.jackyjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//package 不同會有class not found 的問題，會找不到類別方法來使用
//解序列化,解構屬性 
// 
public class Jacky56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				ObjectInputStream oin=new ObjectInputStream(new FileInputStream("dir1/Student.Jacky"));
				Object obj1=oin.readObject();
				Student s2=(Student) obj1;
				Student s3=(Student) (oin.readObject());
				System.out.println(s2.name+":"+s2.calTotal());
				System.out.println(s2.pm+":"+s2.pm);

				System.out.println(s3.name+":"+s3.calTotal());
				
				oin.close();
			} catch (IOException | ClassNotFoundException e) {
				//沒有父子關係的Exception 才能用或
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
	}

}
;