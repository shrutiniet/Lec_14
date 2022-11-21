package Lec_14;
import java.util.*;
public class String_Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1="SS";
		String str2=new String("SS");
		String str3="SS";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
	}

}
