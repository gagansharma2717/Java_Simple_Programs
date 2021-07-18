class DemoMultipleThreads implements Runnable
{
	Thread t1, t2, t3;
	public DemoMultipleThreads()
	{
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);

		t1.start();
		t2.start();
		t3.start();
	}
	synchronized public void run()
	{
		for(int i=0; i<=20; i++)
		{
			System.out.println("First Thread : "+i);
		}
	}
	public static void main(String ar[])
	{
		new DemoMultipleThreads();
	}
}