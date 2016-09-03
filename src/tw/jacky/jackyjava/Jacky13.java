package tw.jacky.jackyjava;

public class Jacky13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("xxx");
		
		jacky:
 		for (int j = 3; j > 0; j--) {	
			for (int i = 0; i < 3; i++) {
					System.out.println(i+";"+j);
					if(i==1) break jacky;
					
					
 			}
		}

	}

}
