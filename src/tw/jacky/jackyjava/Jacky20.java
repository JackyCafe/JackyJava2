package tw.jacky.jackyjava;

public class Jacky20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a;
//		char b=1;
		a=new int[3][2]; //new int 一定要給一個空間,0
					  // new int[-1] 會出現執行時期例外
		              // [b] 可以為變數
				      // byte 的數值會自動轉型為int,內容最大到int (2G),float
		double f[][][]=new double[1][2][3];
		System.out.println(f);  //[[[D@6d06d69c <=3double 指向6d06d69c
		System.out.println(a[0]); // [I@7852e922
		System.out.println(a.length); //3
		System.out.println(a[0].length);//2
		int g[]=new int[4];
		int [] b[];
		b=new int[4][];
		b[0]=new int[]{1,2};
		b[1]=new int[3];               
//		int c[][] =new int[][3]; 不合理，不能先決定隔板再決定層數
		
		int [] h={1,2,3,4};
		System.out.println(h);
		h=new int[5];
		System.out.println(h);
		
		
	}

}
