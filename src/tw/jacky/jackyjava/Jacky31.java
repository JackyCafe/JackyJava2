package tw.jacky.jackyjava;

public class Jacky31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="0123";
		System.out.println(a.concat("Jacky"));
		System.out.println(a.replace('2','k' ));
		// a不會變，return 一個值給你看你要不要用
		
		
		StringBuffer sb1=new StringBuffer();
		sb1.append("abc");
		//System.out.println(sb1); //override toString 照觀念應為]S@1232...
		//System.out.println(sb1.capacity());
//		sb1.append("1234567890123456");
//		System.out.println(sb1.capacity());
		System.out.println(sb1);
		sb1.append("12345678901234567");
		System.out.println(sb1);

		System.out.println(sb1.capacity()); //範圍自動估算後配置
	}

}
