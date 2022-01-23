package developmentPackage;

public class LoopPattern {

	public static void main(String[] args) {
		int j,i=1,n=4,k=1,a=0;
		char ch='A';
		while(i<=n)
		{
			
//			k=i;
			j=1;
//			ch='A';
			while(j<=n)
			{
				System.out.print(ch+" ");
//				k--;
				j++;
				 a=ch;
				ch=(char)(a+1);
			}
			ch='A';
			a=ch+i;
			ch=(char)(a);
			System.out.println();
			i++;
			
		}

	}

}
output
A B C
B C D
C D E