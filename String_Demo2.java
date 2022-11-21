package Lec_14;

public class String_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		String str1="Hello";
		String str2="Hello";   //literal way   (inside internal pool/string pool)
		String str01=new String("hey");    // inside heap but outside internal pool
		String str02=new String("hey");
		System.out.println(str1==str2);   //true as inside string pool
		System.out.println(str01==str02);    //false		

	}

}
