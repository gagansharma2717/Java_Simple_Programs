import java.util.*;
class DemoOverloadingWala
{
	Scanner sc;
	public DemoOverloadingWala()
	{
		sc=new Scanner(System.in);
	}
	public void printStar()
	{
		int j;
		for(int i=1; i<=5; i++)
		{
			for(j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void printStar(int row)
	{
		int j;
		for(int i=1; i<=row; i++)
		{
			for(j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String argp[])
	{
		DemoOverloadingWala ob=new DemoOverloadingWala();
		ob.printStar(10);
	}
}











