class FirstThread implements Runnable
{
	public void run()
	{
		for(int i=0; i<=20; i++)
		{
			System.out.println("First Thread : "+i);
		}
	}
}
class SecondThread implements Runnable
{
	public void run()
	{
		for(int i=0; i<=20; i++)
		{
			System.out.println("Second Thread : "+i);
		}
	}
}
class ThirdThread implements Runnable
{
	public void run()
	{
		for(int i=0; i<=20; i++)
		{
			System.out.println("Third Thread : "+i);
		}
	}
}
class DemoMultiThreads
{
	Thread t1, t2, t3;
	public DemoMultiThreads()
	{
		t1=new Thread(new FirstThread());
		t2=new Thread(new SecondThread());
		t3=new Thread(new ThirdThread());
		
		t1.start();
		t2.start();
		t3.start();
	}
	public static void main(String arg[])
	{
		new DemoMultiThreads();
	}
}







