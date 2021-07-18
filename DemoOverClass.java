class OverClass
{
	int width, height;
	public OverClass()
	{
		width=100;
		height=100;
	}
	public OverClass(int width)
	{
		this.width=width;
		height=100;
	}
	public OverClass(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	public void display()
	{
		System.out.println("Width : "+width);
		System.out.println("Height : "+height);
	}
	public static void main(String arg[])
	{
		//Case 1
		OverClass ob=new OverClass();
		ob.display();
		ob.setWidth(500);
		ob.setHeight(600);
		ob.display();
		//Case 2
		OverClass ob1=new OverClass(299);
		ob1.display();
		//Case 3
		OverClass ob2=new OverClass(299, 343);
		ob2.display();
	}
}











