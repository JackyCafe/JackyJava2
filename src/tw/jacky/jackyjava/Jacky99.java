package tw.jacky.jackyjava;

public class Jacky99 {

	public static void main(String[] args) {

		for (int k = 0; k <= 1; k++) {
			for (int i = 1; i <= 9; i++) {

				for (int j = 2; j <= 5; j++) {
					System.out.print(( j+k*4) + "*" + i + "＝" + i * ( j+k*4) + "\t");

				}
				System.out.println("\n");
			}
			System.out.println("------------------");
		}

	}

}
