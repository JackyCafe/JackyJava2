package tw.jacky.jackyjava;

class Bike2 {
 // 裡面是你care的 東西
	//Field 
    private	double speed;
    static int count; //加上 static 變成全部的類別共同擁有的屬性
    				  //屬於類別的 Bike.count	
    				  //整個腳踏車類共同擁有的	
    
    //Constructor,沒傳回值，方法名稱與類別相同
    //剛出廠的狀態，只會被呼叫一次
    //錯誤觀念--->建立物件實體
    //在這邊時早就有物件實體
    Bike2()
    {
    	count++;
    	System.out.println("Bike()");
    	
    }
    
    //Method
	void upSpeed() // 動詞｜介系詞小寫，名詞第一個字大寫
	{
		speed=(speed==0?1:speed*1.2);
 	}
	
	void downSpeen(){
		speed=(speed==0?1:speed*0.7); 		 
	}
	
	public String toString()
	{
		return null;
		
	}
	
	
	double getSpeed()
	{
		return speed;
	}
}
