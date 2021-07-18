import java.util.*;
class DemoManageDetails
{
	Scanner sc;
	int arr[];
	//int arr[]=new int[10];
	//String arg[]=new String[10];
	//int arr[]={20,43,56,76,87,35};
	public DemoManageDetails()
	{
		sc=new Scanner(System.in);
		arr=new int[10];
	}
	public void accept()
	{
		System.out.println("Enter 10 Values : ");
		for(int i=0; i<10; i++)
		{
				//arr[i]=Integer.parseInt(text.getText());
				arr[i]=sc.nextInt();
		}	
	}
	public void display()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Value "+(i+1)+" is : "+arr[i]);
		}	
	}
	public static void main(String arg[])
	{
		System.out.println("Name is : "+arg[0]);	
		DemoManageDetails ob=new DemoManageDetails();
		ob.accept();
		ob.display();
	}
}