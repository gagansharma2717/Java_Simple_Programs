import java.util.*;
class DemoSumWala
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int first, second, result;
		System.out.print("Enter First Number : ");
		first=sc.nextInt();
		System.out.print("Enter Second Number : ");
		second=sc.nextInt();
		result=first+second;
		System.out.println("Sum is : "+result);
	}
}