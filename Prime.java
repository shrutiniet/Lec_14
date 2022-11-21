package Lec_14;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Prime(n);
	}
public static void Prime(int n)
{
	boolean[] isCom=new boolean[n+1];
	isCom[0]=true;
	isCom[1]=true;
	for(int div=2;div*div<=n;div++)
	{
		if(isCom[div]==false)
		{
			/*for(int table=div*2;table<=n;table++)
			 * {
			 * isCom[table]=true;
			 * }
			 
			 			 */
			for(int table=div*div;table<=n;table=table+div)
			{
				isCom[table]=true;
			}
		}
	}
	for(int num=2;num<n;num++)
	{
		if(isCom[num]==false)
			System.out.print(num+" ");
	}
}
}
