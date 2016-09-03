package tw.jacky.jackyjava;
import java.util.Arrays;

//陣列應用之發牌

public class poker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//洗牌
		int[] poker=new int[52];
		int rand;
		boolean isOk;
		
		for(int i=0;i<poker.length;i++)
		{

			do{
				rand=(int)(Math.random()*poker.length);
				isOk=true;

				for(int j=0;j<i;j++)
				{
					if(poker[j]==rand){
						isOk=false;
						break;
		 			}
				}
				
				
			} while(!isOk);
			poker[i]=rand;
			
			System.out.println(poker[i]);
		}
		
//		System.out.println("-----------");
		//發牌 -->四個玩家
			int[][] player=new int[4][13];
			for(int i=0;i<poker.length;i++)
			{
				player[i%4][i/4]=poker[i];
			}
		
			for(int v:player[0]){
//				System.out.println(v);
			}
		
		
		// 發牌
			String [] suit={"黑桃","紅心","方塊","梅花"};
			String [] value={"A ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","J ","Q ","K " };
			for(int[] cards: player)
			{
				//考認證要知道Arrays.sort package
				Arrays.sort(cards);
				for(int card: cards)
				{
				  	System.out.print(suit[card/13]+value[card%13]+"\t");
					  }
				System.out.println();
				
			}
			
	    //理牌		
			
		
	}

}
