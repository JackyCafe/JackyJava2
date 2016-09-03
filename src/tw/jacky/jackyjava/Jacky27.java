package tw.jacky.jackyjava;

public class Jacky27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(TWId.isOk("B120863158"));
//		char A=65;
//		System.out.println(A);
		
		
//		TWId myId=new TWId("B120863158"); //本事件中 new 出之後，沒有機會換掉他
		TWId myId=new TWId(true,1);
		System.out.println(myId.getId());
		System.out.println(TWId.isOk(myId.getId()));
//		TWId.isOk("B120863158");
//		TWId urId=new TWId("B234567890");
		
//		TWId();
//		TWId();
		
		
		
		
		
//Y120239847,M220093979
//		System.out.println(myId.getId());
//		System.out.println(urId.getId());

//		System.out.println(myId.getGender()?"男":"女");
//		System.out.println(myId.getArea());
	}

}
