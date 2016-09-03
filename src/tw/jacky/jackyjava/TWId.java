package tw.jacky.jackyjava;

public class TWId {
	//物件核心是字串，外界可透過方法傳回資訊
	//物件的屬性
	private String id;//="A123456789"; //不封裝隨時都會被盜用
	static String check="ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	
	//產生物件實體後的初始化動作
	TWId(String id)
	{
		//<我的>類別的id,
		this.id=id;
		System.out.println("here");
	}
	
	TWId(boolean gender){
		this(gender,(int)(Math.random()*26));
	}
	
	TWId(int area)
	{
		this((int)(Math.random()*2)==0 ,area );
		
	}
	
	
	TWId(boolean gender,int area)
	{
		StringBuffer sb1=new StringBuffer(check.substring(area, area+1));
//		id= ;
//		sb1.append(id);
		sb1.append(gender==true?"1":"2");		
		for(int i=0;i<7;i++)
		{
			sb1.append((int)(Math.random()*10));
		}
 		
		for(int i=0;i<10;i++)
		{
			if(isOk(sb1.append(i).toString()))
			{
				id=sb1.append(i).toString();
				break;
			}
//			
		}
		
	}
	
	//傳回身分證字串
	String getId()
	{
		return id;
	}
	
	//傳回性別
	boolean getGender(){
			//走比較嚴謹的JavaBean 要用this.id
		return id.charAt(1)=='1';

//			return id.charAt(1)=='1'?true:false;
	}
	
	//傳回地區
	String getArea()
	{
		return "台中市";
		
	}
	
	//是否是一個合理的身分證
	static boolean isOk(String testId)
	{	boolean ret=false;
		
		if(preCheck(testId)){
			ret=true;
			int n12=check.indexOf(testId.charAt(0))+10;
			int n1=n12/10;
			int n2=n12%10;
			int n3=Integer.parseInt(testId.substring(1,2));
			int n4=Integer.parseInt(testId.substring(2,3));
			int n5=Integer.parseInt(testId.substring(3,4));
			int n6=Integer.parseInt(testId.substring(4,5));
			int n7=Integer.parseInt(testId.substring(5,6));
			int n8=Integer.parseInt(testId.substring(6,7));    	
			int n9=Integer.parseInt(testId.substring(7,8));
			int n10=Integer.parseInt(testId.substring(8,9));
			int n11=Integer.parseInt(testId.substring(9,10));
			int total=n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1 ;
			if(total%10==0) ret=true;
			System.out.println(total);;
				
			
		}else {
			ret=false;
		};
		
		return ret;
	}
	
	
	static boolean preCheck(String testId)
	{
		
		// 第一碼Ａ～Ｚ
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(charAt(i))
		boolean ret=false;
//		if(testId.length()==10)
//		{ret=true;}
//		else
//		{
//		ret=false;
//		
//		
//		}
		boolean isOk=false;
		
		if(testId.matches("^[A-Z][12][0-9]{8}$"))
		{
			isOk=true;
		}
		
		
		
		return isOk;
	}
}
