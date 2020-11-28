import java.util.Scanner;
class SpecialNumber 
{
	public static void main(String[] args) 
	{
		 Scanner s= new Scanner(System.in);

		System.out.println("---- Program will Print SPECIAL NUMBER of given range");
		System.out.println("Enter Start number :" );
		int start = s.nextInt();
		System.out.println("Enter End number :" );
		int end = s.nextInt();

		for (int temp=start;start<=end ;start++ )
		{
			int sum = 0;
			int prod = 1;
			int count = 0;

			for (int i=start;i>0 ;i=i/10 )
			{
				int digit = i%10;

				sum  = sum+digit;
				prod = prod*digit;
			}

			if (start == (sum+prod))
			{
				System.out.println("Special Number is : "+start );
			}
		}

	}
}
