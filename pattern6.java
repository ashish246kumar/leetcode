package developmentPackage;

public class LoopPattern {

	public static void main(String[] args) {
		int j,i=1,n=4,k=1,a=0;
		char ch='D';
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
			ch='D';
			a=ch-i;
			ch=(char)(a);
			System.out.println();
			i++;
			
		}

	}

}
OUTPUT
D
C D
B C D
A B C D