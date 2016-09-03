package tw.jacky.jackyjava;

import java.io.File;

public class Jacky46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] roots=File.listRoots();
		for(File f:roots)
		{
			System.out.println(f.getAbsolutePath());
			}
	}

}
