import java.util.Scanner;
class PrimeNo
{
	public static void main(String[]args)
	{
			System.out.println("Enter the no");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int Count=0;
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					Count++;
				}
			}	
			if(Count==2)
			{
				System.out.println("Prime no");
			}
			else
			{
				System.out.println("Not a prime no");
			}
	}
}