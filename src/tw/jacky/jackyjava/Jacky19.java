package tw.jacky.jackyjava;

public class Jacky19 {

	
	// 作弊的骰子
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] p=new int[6];
		
		for(int i=0;i<=10000;i++)
		{
			int point= (int)(Math.random()*9);
			p[point>=6?point-3:point]++; 
	 	}
			 
		
		for(int i=0;i<p.length;i++)
		{
 			System.out.println((i+1)+":"+p[i]);}
		}
		
 
}
