package tw.jacky.jackyjava;

public class Jacky17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] month={31,28,31,30,31,30,31,31,30,31,30,31};
		int day=0;
		for(int i=0;i<month.length;i++)
		{
			day=day+month[i];
		}
		System.out.println(day);
	}

}
