package tw.jacky.jackyjava;

import javax.swing.JOptionPane;

public class GuessNumber {

	public static void main(String[] args)
	{
		// 產生謎底
		String answer=createAnswer(3);
		String[] history=new String[10]; //
		System.out.println(answer);
		String res="";
		// 開始猜
		
		for(int i=0;i<10;i++)
		{
			String guess=JOptionPane.showInputDialog("猜吧");
			if(guess.equals(answer)) // 比對內容有沒有一樣
			{
				JOptionPane.showMessageDialog(null, "恭喜老爺");
				break;
			}else{
				
				String result=checkAB(answer,guess);
				history[i]=guess+"\t"+result;
				res=res+history[i]+"\n";
				JOptionPane.showMessageDialog(null, guess+":"+result+":"+"\n\n"+res);
				
			}
			  
		}
		 
		
	}

	static String checkAB(String ans,String guess){
		int A,B;A=B=0;
		for(int i=0;i<guess.length();i++)
		{
			if(ans.charAt(i)==guess.charAt(i))
			{
				A++;
			}else if(ans.indexOf(guess.charAt(i))!=-1)
			{
				B++;
			}
				 
		}
		return A+"A"+ B+"B";
	}
	
	
	
	
	
	//不需產生物件實體，執行時及載入記憶體
	 static String createAnswer(int n) {
		// TODO Auto-generated method stub
		 int[] ans=new int[n];
		 
		 int rand;
		 boolean isOk=true;
		 
		 for(int i=0;i<ans.length;i++){
			 do{
		      isOk=true;		 
			 rand=(int)(Math.random()*10);
			 for(int j=0;j<i;j++)
			 {
				 if(ans[j]==rand)
				 {
					 isOk=false;
					 break;
				 }
			 }
			 
			 }while(!isOk);
			 ans[i]=rand;
		 }
		  
		 String ret="";
		 for (int v:ans)
		 {
			ret=ret+v; 
		 }
		 
		return ret;
	}
	
	
	
	
}
