class DemoThreadWala implements Runnable
{
	Thread t1;
	public DemoThreadWala()
	{
		System.out.println("Constructor Started");
		t1=new Thread(this);
		t1.start();
		System.out.println("Constructor Finished");
	}
	public void run()
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println("Thread is : "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ee)
		{}
	}
	public static void main(String ar[])
	{
		System.out.println("Main Started");
		DemoThreadWala ob=new DemoThreadWala();
		ob.fun();
		System.out.println("Main Finished");
	}
}







