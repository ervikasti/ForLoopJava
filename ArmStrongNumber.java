import java.util.Scanner;
class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		 Scanner s= new Scanner(System.in);

		System.out.println("---- Program will Print ARMSTRONG NUMBER of given range");
		System.out.println("Enter Start number :" );
		int start = s.nextInt();
		System.out.println("Enter End number :" );
		int end = s.nextInt();

		for (int temp=start;start<=end ;start++ )
		{
			int sum = 0;

			int count = 0;

			for (int j=start;j>0 ;j=j/10 )
			{
				int digit = j%10;
				count++;
			}

			System.out.println("count "+count);

			for (int i=start;i>0 ;i=i/10 )
			{
				int prod = 1;
				int digit = i%10;
				System.out.println("i "+digit);

				int fact = 1;
				int pow = count;
				
				for (int k=digit ;pow>0 ;pow-- )
				{
					prod = prod*digit;
				}
				System.out.println("prod "+prod);
				sum  = sum + prod;
				System.out.println("sum "+sum);
				
			}

			if (start == sum)
			{
				System.out.println("ArmStrong Number is : "+start );
			}
		}

	}
}
