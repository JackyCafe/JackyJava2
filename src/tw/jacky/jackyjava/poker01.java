package tw.jacky.jackyjava;

public class poker01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[20];
		int rand;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		
		
		for(int j=a.length-1;j>=0;j--)
		{
			rand=(int)(Math.random()*j);
			//交換
			temp=a[rand];
			a[rand]=a[j];
			a[j]=temp;
		}
		
		for(int v:a)
		{
			System.out.print(v+"\t");
		}

	}

}
