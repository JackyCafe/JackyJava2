package tw.jacky.p2;

import tw.jacky.jackyjava.Bike;

//Bike2 不是public 無法被entends
class III02 extends Bike{
	
	// Bike 的存取修飾字必須public 或protected
	III02()
	{
		
	}
	
	void myUpSpeed()
	{
		upSpeed();
		//super.upSpeed
	}
	
	
	
}


 class III022 extends III01
 {}