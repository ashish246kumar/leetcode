package developmentPackage;

public class LoopPattern {

	public static void main(String[] args) {
		int j,i=1,n=4,k=1,a=0;
		char ch='A';
		while(i<=n)
		{
			

			j=1;

			while(j<=i)
			{
				System.out.print(ch+" ");
				j++;
				 a=ch;
				ch=(char)(a+1);
			}

			System.out.println();
			i++;
			
		}

	}

}
output
A
B C
D E F