package test;
import java.util.*;
public class Examplee {
public static void main (String args[])
{
String s1="hello";
String s2="hello";
String s3=new String("hello");
String s4=new String("hello");
String s5="122";
String s6="2";
int l1=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String name1=sc.nextLine();
System.out.println("enter 2 string");
String name2=sc.next();
String name=name1+" "+name2;
System.out.println(name);
System.out.println(name.length());
System.out.println(name.charAt(0));
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s4.equals(s3));
System.out.println(s1==s3);
System.out.println(s4==s3);
System.out.println(s1.substring(3));
System.out.println(s1.substring(5));
int number=Integer.parseInt(s5);
int number2=Integer.parseInt(s6);
System.out.println(number+number2);
String s7=Integer.toString(number2);
System.out.println(s7+3);
System.out.println("enter the size of array");
int size=sc.nextInt();
String[] str=new String[size];
for(int i=0;i<size;i++)
{
	str[i]=sc.nextLine();
	l1=l1+str[i].length();
}
System.out.println(l1);
for(int i=0;i<size;i++)
{
	System.out.println(str[i]);
}
String res="";
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)=='l')
	{
		res=res+'L';
	}
	else {
		res=res+s1.charAt(i);
	}
}
System.out.println(res);
String s8="ashishkr14@gmail.com";
String user="";
for(int i=0;i<s8.length();i++)
{
	if(s8.charAt(i)=='@')
	{
		break;
	}
	else {
		user=user+s8.charAt(i);
	}
}
System.out.println(user);
}
}