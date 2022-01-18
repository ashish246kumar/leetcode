package test;

public class SumOfArrrayUsingRecursion {
	public int sum(int[]arr,int size)
	{
		if(size==0)
		{
			return 0;
		}

		return arr[size-1]+sum(arr,size-1);
	}
public static void main(String args[])
{
	SumOfArrrayUsingRecursion sc=new SumOfArrrayUsingRecursion();
	int[] arr=new int[] {5,6,7,8,9};
	int size=arr.length;
	System.out.println(sc.sum(arr,size));
}
}
