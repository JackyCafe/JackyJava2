package tw.jacky.jackyjava;

public class Jacky12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 0; j < 10; j++) {
			for (int i = 0; i <= 10; i++) {
					int v=j*10+i;
					boolean isOk=true;
					for(int k=2;k<v;k++)
					{
						if(v%k==0){
							isOk=false;
							break;
							}
							
					}
					
					System.out.print(v+ (isOk?"*":" ")+ "\t");
		
			}
				System.out.println();
		}

//		for (int i = 1; i <= 100; i++) {
//			if (i % 10 == 0)
//				System.out.print(i + "\n");
//			else
//				System.out.print(i + "\t ");
//
//		}

	}

}
