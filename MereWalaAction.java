interface MeraActionListener
{
	public void actionKar(String s);
}
class MeraButton
{
	public void meraAddAction(MeraActionListener ob)
	{
		ob.actionKar("Hello");
	}
}
class MeriClass implements MeraActionListener
{
	MeraButton ob;
	public MeriClass()
	{
		ob=new MeraButton();
		ob.meraAddAction(this);
	}
	public void actionKar(String s)
	{
		System.out.println(s);
	}
	public static void main(String arg[])
	{
		MeriClass obj=new MeriClass();
	}
}









	
