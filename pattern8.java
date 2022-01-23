package developmentPackage;

public class LoopPattern {

	public static void main(String[] args) {
		int j,i=1,n=4,k=1,a=0;
		char ch='D';
		while(i<=n)
		{
			

			j=n;

			while(j>=1)
			{
				if(j>=i)
				{
					System.out.print("*");
				}

				j--;

			}

			System.out.println();
			i++;
			
		}

	}

}
OUTPUT
****
***
**
*