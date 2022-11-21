package Lec_14;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aamul";
		System.out.println(str);
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.substring(1,2));
		sb.setCharAt(1, '`');
		System.out.println(sb);
		sb.append(" hello");
		System.out.println(sb);
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.insert(1, " baaaaaaa");
		System.out.println(sb);
	}

}
