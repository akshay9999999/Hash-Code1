import java.util.Scanner;
class Leapyear
{
	public static void main(String[]args)
	{
		System.out.println("Enter Year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.print("Result:-");
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else if(year%100==0)
		{
			System.out.println("Not Leap Year");
		}
		else if(year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap year");
		}
	}
}