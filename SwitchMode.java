import java.util.Scanner;
import java.lang.*;
class SwitchMode
{
	int first,second,result,choice;
	char s;
	Scanner sc;
	public SwitchMode()
	{
	sc= new Scanner(System.in);
	first= 0;
	second= 0;
	result= 0;
	choice= 0;
	}
	
	private void acceptValues()	
	{
		
		System.out.print("Enter First Number   ::>>> ");
		first= sc.nextInt();
		System.out.print("Enter Second Number  ::>>> ");
		second= sc.nextInt();
	}
	
	private void addKarlo()
	{
		do
		{
			if(result==0)
			{
				acceptValues();
				result=first+second;
				System.out.print("Add is ::>>>"+result);
			}
			else
			{
				System.out.print("Enter new number  ::>>>");
				second=sc.nextInt();
				result+=second;
				System.out.print("Add is ::>>>"+result);
				
			}
		System.out.println("");
		System.out.print("Do you want to add more numbers? [y/n]");
		s= sc.next().charAt(0);
		}		
		while(s=='y'|| s=='Y');
		menuCalc();
		
	}
	private void subKarlo()
	{
		do
		{
			if(result==0)
			{
				acceptValues();
				result=first-second;
				System.out.print("Sub is ::>>>"+result);
			}
			else
			{
				System.out.print("Enter new number  ::>>>");
				second=sc.nextInt();
				result-=second;
				System.out.print("Sub is ::>>>"+result);
				
			}
		System.out.println("");
		System.out.print("Do you want to sub more numbers? [y/n]");
		s= sc.next().charAt(0);
		}		
		while(s=='y'|| s=='Y');
		menuCalc();
	}		
	private void mulKarlo()
	{
		do
		{
			if(result==0)
			{
				acceptValues();
				result=first*second;
				System.out.print("Mul is ::>>>"+result);
			}
			else
			{
				System.out.print("Enter new number  ::>>>");
				second=sc.nextInt();
				result*=second;
				System.out.print("Mul is ::>>>"+result);
				
			}
		System.out.println("");
		System.out.print("Do you want to mul more numbers? [y/n]");
		s= sc.next().charAt(0);
		}		
		while(s=='y'|| s=='Y');
		menuCalc();
		}
	private void divKarlo()
	{
		do
		{
			if(result==0)
			{
				acceptValues();
				result=first/second;
				System.out.print("Div is ::>>>"+result);
			}
			else
			{
				System.out.print("Enter new number  ::>>>");
				second=sc.nextInt();
				result/=second;
				System.out.print("Div is ::>>>"+result);
				
			}
		System.out.println("");
		System.out.print("Do you want to Div more numbers? [y/n]");
		s= sc.next().charAt(0);
		}		
		while(s=='y'|| s=='Y');
		menuCalc();
	}
	public static void main(String args[])
	{
	SwitchMode s1=new SwitchMode();
	s1.menuCalc();
	}
	public void menuCalc()
{
	System.out.println("");
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	System.out.println("& Enter 1 for Add				&");
	System.out.println("& Enter 2 for Sub				&");
	System.out.println("& Enter 3 for Mul				&");
	System.out.println("& Enter 4 for Div				&");
	System.out.println("& Enter 5 for clear				&");
	System.out.println("& Enter 6 for display table 1 to 10		&");
	System.out.println("& Enter 7 for display table 11 to 20		&");
	System.out.println("& Enter 8 for display customized table		&");
	System.out.println("& Enter 9 for Exit				&");
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	System.out.println("");
	System.out.print("Enter Your Choice  ::>>> ");
	choice=sc.nextInt();
	switch(choice)
	{
		case 1:
				addKarlo();
				break;
		case 2:
				subKarlo();
				break;
		case 3:
				mulKarlo();
				break;
		case 4:
				divKarlo();
				break;
		case 5:
				result=0;
				System.out.print("Result was cleared....");
				menuCalc();
				break;
		case 6:
				countTable(1,10);
				menuCalc();
				break;
		case 7:
				countTable(11,20);
				menuCalc();
				break;
		case 8:
				System.out.print("Enter starting of Table:");
				first=sc.nextInt();
				System.out.print("Enter ending of Table:");
				second=sc.nextInt();
				if(second-first>9)
				{	
				System.out.println("Difference should be less than or equal to 10");
				menuCalc();
				}
				else
				{					
				countTable(first,second);
				menuCalc();
				}
				break;
		case 9:
				System.out.print("Is Baar Toh Jaane Diya Agli Baar Nhi Jaane Denge...");				
				System.exit(0);
		default:
				System.out.println("Invalid Choice...");
				menuCalc();
				
	}
}
private void countTable(int start,int end)
{
	int j,count=0;
	for(int i=1;i<=10;i++)
	{
		for(j=start;j<=end;j++)
		{
			System.out.format("%5d",i*j);
			System.out.print("|");
		}
		System.out.println("");
	}
}
}