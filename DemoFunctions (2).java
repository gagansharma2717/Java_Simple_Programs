import java.util.*;
class DemoFunctions
{
	int first, second, third;
	Scanner sc;	
	public DemoFunctions()
	{
		System.out.println("Constructor Chal gya..");
		sc=new Scanner(System.in);
	}
	public static void sub()
	{
		int a, b, c;
		a=10;
		b=5;
		c=a-b;
		System.out.println("Sub is : "+c);
		
	}
	public void acceptValues()
	{
		System.out.print("Enter First Number : ");
		first=sc.nextInt();
		System.out.print("Enter Second Number : ");
		second=sc.nextInt();
		System.out.print("Enter Third Number : ");
		third=sc.nextInt();
	}
	public void checkGreatest()
	{
		if(first>second && first>third)
		{
			System.out.println(first+"  is greatest number!");
		}
		else if(second>third)
		{
			System.out.println(second+"  is greatest number!");
		}
		else
		{
			System.out.println(third+"  is greatest number!");
		}
	}
	public void sum()
	{
		System.out.print("Enter First Number : ");
		first=sc.nextInt();
		System.out.print("Enter Second Number : ");
		second=sc.nextInt();
		third=first+second;
		System.out.println("sum is : "+third);
	}
	public static void main(String arg[])
	{
		sub();
		System.out.println("Object Declared");
		DemoFunctions ob;
		System.out.println("Object Ban gya h");
		ob=new DemoFunctions();
		ob.sum();
	}
}
