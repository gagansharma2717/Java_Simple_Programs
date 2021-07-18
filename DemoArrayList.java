import java.util.*;
class DemoArrayList
{
	ArrayList<HashMap<String, String>> data;
	Scanner sc;	
	public DemoArrayList()
	{
		sc=new Scanner(System.in);
		data=new ArrayList<HashMap<String, String>>();
	}
	private void acceptDetails()
	{
		String strName, strAddress, strCity, strPhone;
		System.out.print("Enter Name : ");
		strName=sc.next();
		System.out.print("Enter Address : ");
		strAddress=sc.next();
		System.out.print("Enter City : ");
		strCity=sc.next();
		System.out.print("Enter Phone : ");
		strPhone=sc.next();
		HashMap<String, String> user=new HashMap<String, String>();
		user.put("name", strName);
		user.put("address", strAddress);
		user.put("city", strCity);
		user.put("phone", strPhone);
		data.add(user);
		
		
	}
	private void displayDetails()
	{
		int tot=data.size();
		for(int i=0; i<tot; i++)
		{
			HashMap<String, String> u=data.get(i);
			String n=u.get("name");
			String a=u.get("address");
			String c=u.get("city");
			String p=u.get("phone");
			
			System.out.println("Name is  : "+n);
			System.out.println("Address is  : "+a);
			System.out.println("City is  : "+c);
			System.out.println("Phone is  : "+p+"\n");
		}

	}
	public void mainScreen()
	{
		int choice;
		do
		{
			System.out.println("Enter 1 for Add User Details!");
			System.out.println("Enter 2 for Display Details!");
			System.out.println("Enter 3 for Exit!");

			System.out.print("Enter Your Choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					acceptDetails();
					break;
				}
				case 2:
				{
					displayDetails();
					break;
				}
				case 3:
				{
					System.out.println("Phir kab miloge??");
					break;
				}
				default:
				{
					System.out.println("Invalid Choice!!");
				}
		
			}
		}
		while(choice!=3);
	}
	public static void main(String arg[])
	{
		DemoArrayList ob=new DemoArrayList();
		ob.mainScreen();
	}
}