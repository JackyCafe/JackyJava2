package tw.jacky.jackyjava;

import java.io.File;

public class Jacky45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("dir1/dir3/dir4/dir5/dir6");
		if(f1.mkdirs()){
			System.out.println("create dir2 ok"); //附目錄不存在自動幫忙建
		}

	}

}
