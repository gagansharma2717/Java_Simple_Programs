class DemoFirst
{
	public DemoFirst()
	{
		System.out.println("First Class's Default constructor!");
	}
	public DemoFirst(int a)
	{
		System.out.println("First Class's Parameterized constructor : "+a);
	}
	public void firstFun()
	{
		System.out.println("First Function of First Class!");
	}
	public void fun()
	{
		System.out.println("Fun Function of first class!");
	}
}
class DemoSecond extends DemoFirst
{
	public DemoSecond()
	{
		System.out.println("Second Class's Default constructor!");
	}
	public DemoSecond(int a)
	{
		super(a);
		System.out.println("Second Class's Parameterized constructor : "+a);
	}
	public void secondFun()
	{
		System.out.println("Second Function of Second Class!");
	}
	public void fun()
	{
		System.out.println("Fun Function of Second class!");
	}
}
class DemoThird extends DemoSecond
{
	public DemoThird()
	{
		System.out.println("Third Class's Default constructor!");
	}
	public DemoThird(int x)
	{
		super(x);
		System.out.println("Third Class's Parameterized constructor : "+x);
	}
	public void thirdFun()
	{
		System.out.println("Third Function of Third Class!");
	}
	public void fun()
	{
		System.out.println("Fun Function of third class!");
		super.fun();
	}
}
class DemoInherit
{
	public static void main(String ar[])
	{
		/*DemoSecond ob=new DemoSecond();
		ob.firstFun();
		ob.secondFun();*/
		DemoThird ob1=new DemoThird(23);
		ob1.firstFun();
		ob1.secondFun();
		ob1.thirdFun();
		ob1.fun();
	}
}









