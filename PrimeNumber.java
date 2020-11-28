import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("---- Program will Print PRIME NUMBER of given range");
		System.out.println("Enter Start number :" );
		int start = s.nextInt();
		System.out.println("Enter End number :" );
		int end = s.nextInt();
		

		for (int i=start; start<=end ;start++ )
		{

			int k = 2;

			for (int j=k;k<=start ;k++ )
			{

				if (start%k==0)
				{
					break;
				}
				


			}
			if (k == start) 
			{
				System.out.println("Prime Number is : "+num);
			}


		}
	}
}
