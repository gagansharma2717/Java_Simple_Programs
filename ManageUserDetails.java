import java.util.*;
class ManageUserDetails
{
	ArrayList<UserDetails> data;
	Scanner sc;	
	public ManageUserDetails()
	{
		sc=new Scanner(System.in);
		data=new ArrayList<UserDetails>();
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
		UserDetails user=new UserDetails();
		user.setName(strName);
		user.setAddress(strAddress);
		user.setCity(strCity);
		user.setPhone(strPhone);
		data.add(user);
		
		
	}
	private void displayDetails()
	{
		int tot=data.size();
		for(int i=0; i<tot; i++)
		{
			UserDetails u=data.get(i);
			String n=u.getName();
			String a=u.getAddress();
			String c=u.getCity();
			String p=u.getPhone();
			
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
		ManageUserDetails ob=new ManageUserDetails();
		ob.mainScreen();
	}
}