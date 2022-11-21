package Lec_14;

public class String_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="aajhey";
		
		String str2=str1.substring(0,3);    //following new keyword
		System.out.println(str2);		
		//System.out.println(str2==str3);
		str2.intern();
		String str3="aaj";
		System.out.println(str2==str3);
	}

}
