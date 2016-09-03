package tw.jacky.jackyjava;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Jacky55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student s1=new Student(new PM(),"Dave",90,50,75);
			Student s2=new Student(new PM(),"Tony",80,45,75);

			System.out.println(s1.calTotal());
			System.out.println(s1.calAvg());
			
			try {
				ObjectOutputStream out=new ObjectOutputStream(
						new FileOutputStream("dir1/Student.Jacky"));
				out.writeObject(s1);  //會拋出 java.io.NotSerializableException
				out.writeObject(s2);  //會拋出 java.io.NotSerializableException

				out.flush();
				out.close();
			} catch (IOException e) {
				System.out.println(e.toString());
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}

class Student implements Serializable {
	int ch,eng,math; //基本型別
	String name; //物件型別 ,String implements Serializable
	PM pm;
	public Student(PM pm,String name,int ch,int eng,int math) {
		// TODO Auto-generated constructor stub
		this.pm=pm;
		this.name =name ;
		this.ch=ch;
		this.eng=eng;
		this.math=math;
		
	
	}
	
	int calTotal() {return ch+eng+math;}
	
	double calAvg() {return calTotal()/3.0;}
	
}

//java.io.NotSerializableException:
class PM implements Serializable{
	//類別所擁有的屬性也需要序列化
}