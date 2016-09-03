package tw.jacky.jackyjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Jacky52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fin=new FileInputStream("dir1/staff.csv");
			InputStreamReader irs= new InputStreamReader(fin); //irs is a reader
			BufferedReader br=new BufferedReader(irs);
			String line;
			while ((line=br.readLine())!=null)
			{
				String[] row=line.split(",");
				for(String data:row){
				System.out.print(data+"\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	}

}
