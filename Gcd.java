package test;
import java.util.*;
public class Gcd {
	public int greatest(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		if(b==0)
		{
			return a;
		}
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else {
				b=b-a;
			}
			
		}
		return a;
		
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Gcd g=new Gcd();
		System.out.println("enter 1st number");
		int a= sc.nextInt();
		System.out.println("enter 2nd number");
		int b=sc.nextInt();
		System.out.println(g.greatest(a,b));
		
	}
}
