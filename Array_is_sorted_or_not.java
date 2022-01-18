package test;

public class GivenArrrayIsSortedOrNotUsingRecursion {
	public boolean sortorNot(int[]arr,int size)
	{
		if(size==0||size==1)
		{
			return true;
		}
		if(size>=2&&arr[size-2]>arr[size-1])
		{
			return false;
		}
		else {
			boolean b=sortorNot(arr,size-1);
			return b;
		}
	}
	public static void main(String args[])
	{
		GivenArrrayIsSortedOrNotUsingRecursion ga=new GivenArrrayIsSortedOrNotUsingRecursion();
		int[] arr=new int[] {2,4,6,12,10};
		int size=arr.length;
		int item=1;
		System.out.println(ga.sortorNot(arr, size));
	}
}
