interface MyInter
{
	public void abc();
}
interface FirstInter
{
	public void pqr();
}
interface SecondInter extends MyInter, FirstInter
{
	public void xyz();
}
class MyInterClass implements SecondInter
{
	public void abc()
	{
		System.out.println("Abc Method of MyInterClass!");
	}
	public void xyz()
	{
		System.out.println("XYZ Method of MyInterClass!");
	}
	public void pqr()
	{
		System.out.println("PQR Method of MyInterClass!");
	}
	public void fun()
	{
		System.out.println("Fun Function of MyInterClass!");
	}
	public void MyFun()
	{
		System.out.println("My Fun Function of MyInterClass!");
	}
}
class DemoInterfaces
{
	public static void main(String arpg[])
	{
		SecondInter ob=new MyInterClass();
		ob.abc();
		ob.xyz();
		ob.pqr();
		
	}
}









