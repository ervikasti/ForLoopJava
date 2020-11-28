import java.util.Scanner;
class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("---- PROGRAM WILL PRINT STRONG NUMBER OF GIVEN RANGE -----");
		System.out.println("Enter starting number :");
		int start = s1.nextInt();
		System.out.println("Enter ending number :");
		int end = s1.nextInt();


		


			int sum = 0;

		for (int temp=start;start<end ; start++ )
		{
			sum = 0;
		for (int i=start ;i>0; i=i/10)
		{
			int digit = i%10;
			//System.out.println("Digit : "+digit);

			int fact = 1;
			for (int j=digit; j>0;j-- )
			{
				fact = fact*j;
				//System.out.println("fact : "+fact);
			}
		

			sum = sum + fact;
			//System.out.println("sum : "+sum);

		}
			if(sum==start)
			{
				System.out.println("STRONG NUMBER "+sum);
			}
			else
			{
				//System.out.println("Not a strong number :"+start);
			}
			
	
		}
	

	}
}
