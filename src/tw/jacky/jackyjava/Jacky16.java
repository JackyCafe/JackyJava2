package tw.jacky.jackyjava;

public class Jacky16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java 為強型別，宣告甚麼就是什麼
		int [] a;//整數陣列 名字叫a,官方建議，宣告 
		int b[]; //整數Ｂ陣列
		int c ;//宣告變數時，沒給初始值
		c=12; //第一次給值
		System.out.println(c);
		
		//new ==>跟記憶體要空間
		//只要new 出空間，就已經完成初始化， 預設值為0
		// 8 大型別 byte,double,float,char,int,short ,long,boolean
		// = 就已經初始化給值 ，
		// a==>參考由a的初始位置 a[偏移]，a 要換算幾個偏移量 
		
		a=new int[7]; //a 4個元素，new 出多少空間，不能多也不能少
		System.out.println(a.length);
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println(a[3]); 
		//System.out.println(a[4]); //例外出現  java.lang.ArrayIndexOutOfBoundsException: 4

		//改變其值
		a[2]=12;
		a[5]=100;
		a[6]=2;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int[] d=new int[3];
		int[] e=new int[]{1,2,3,5,7};//宣告同時直接給值
		//int[] f=new int[5]{1,2,3,5,7};//編譯失敗
	   int [] f={1,2,3,5,7};		 //也可以
		 //int [] g
	     //g={1,2,3,5,7}; 編譯失敗，宣告後要同時給值
		for(int i=0;i<e.length;i++)
		{
		System.out.println(e[i]);	
		}
		
		
	}

}
