import java.util.Scanner;
class Fibonnaci 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("---- Program will Print FIBONNACI SERIES of n Th no. -----");
		System.out.println("Enter n th  number :" );
		int n = s.nextInt();
		

		int a = 0;
		int b = 1;
		System.out.print(a+" " );
		System.out.print(b+" ");

		for (int i=2; i<=n ;i++ )
		{


			for (int j=2 ; j>=1 ;j-- )
			{
				int c= a+b;
				System.out.print(c+" ");
				a = b;
				b = c;

			}

		}
	}
}
