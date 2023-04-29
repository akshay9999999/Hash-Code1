import java.util.Scanner;
class Max3digits
{	
	public static void main(String[]args)
	{
		System.out.println("Enter no");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt(); 
		int b=sc.nextInt(); 
		int c=sc.nextInt();

		System.out.print("Result:-");
		if (a>b)
		{
			if(a>c)
				System.out.println(a);
			
			else
				System.out.println(c);
		}
		else
		{
			if(b>c)
				System.out.println(b);
			
			else
				System.out.println(c);
		}
	}
}