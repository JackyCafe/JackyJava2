package tw.jacky.jackyjava;

public class Jacky24 {
	public static void main(String[] args)
	{
		double c;
		Bike myBike,urBike;
		myBike=new Bike(); //物件被new 物件實體出來時，自動會完成初始化，屬性不會不清不楚
						   //ex 螢幕長寬高都知道了	
		
//		System.out.println(c); //c沒初始化
		System.out.println(myBike.getSpeed());
		//System.out.println(urBike.speed);  //	The local variable urBike may not have been initialized
		myBike.upSpeed();
		myBike.upSpeed();
		myBike.upSpeed();
		System.out.println("myBike"+myBike.getSpeed());
		int i=0;
		while(myBike.getSpeed()<10)
		{
			myBike.upSpeed();
			i++;
		}
		System.out.println("myBike"+i+":"+myBike.getSpeed());
		System.out.println("myBike"+i+":"+myBike); //一個參考位址

		
	}

}
