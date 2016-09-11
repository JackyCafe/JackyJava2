package tw.jacky.jackyjava;

public class Jacky68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Jacky681 obj=new Jacky681("a");
			obj.start(); //表現他的生命，會去叫run來實作
//			obj.start();  生命的表現只有一次，所以會有例外
//			obj.start(); 
			System.out.println("----------");
			Jacky681 obj2=new Jacky681("b");
			obj2.start();   // 同時表示生命週期
			Jacky681 obj3=new Jacky681("c");
			obj3.start();   // 同時表示生命週期
			//start 進ＣＰＵ 排隊等候叫號
			
//			obj.run(); //生命/

	}

}


//
class Jacky681 extends Thread
{
	 private String name;
	 
	 public Jacky681(String name)
	 {
		 this.name=name;
	 }
	
	// 行為會表現在 override run方法
	// 這個類別的人生的意義
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		super.run();
		for(int i=0;i<10;i++)
		{
			System.out.println(name+":"+i+"\t");
			try {
				Thread.sleep(100);
				//睡醒了，去後選區排隊等候叫號
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
		} //生命表演到又括號 就結束了．物件還在
		
	}

}