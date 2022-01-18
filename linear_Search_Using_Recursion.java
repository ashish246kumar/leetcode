package test;

public class LinearSearchUsingRecursion {
public boolean linear(int[] arr,int size,int item)
{
	if(size==0)
	{
		return false;
	}
	if(arr[size-1]==item)
	{
		return true;
	}
	else
	{
	boolean b=linear(arr,size-1,item);
	return b;
	}
}
	
	public static void main(String args[])
	{
		LinearSearchUsingRecursion li=new LinearSearchUsingRecursion();
		int[] arr=new int[] {2,4,6,8,10};
		int size=arr.length;
		int item=1;
		System.out.println(li.linear(arr, size, item));
	}
}
