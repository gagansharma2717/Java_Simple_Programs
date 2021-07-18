interface TV
{
	public void display();
	public void sound();
}
interface Camera
{
	public void photo();
	public void video();
}
class Sony implements TV, Camera
{
	public void display()
	{
		System.out.println("Display ek dum badiya hai..");
	}
	public void sound()
	{
		System.out.println("Woofer wale speaker hain..");
	}
	public void photo()
	{
		System.out.println("Picture High Resolution ki hain...");
	}
	public void video()
	{
		System.out.println("4K Video bana sakte hain...");
	}
}
class LG implements TV
{
	public void display()
	{
		System.out.println("Motions se on off hota hai.. picture quality thik thik hai..");
	}
	public void sound()
	{
		System.out.println("Normal Speaker hain..");
	}
}
class Samsung implements TV
{
	public void display()
	{
		System.out.println("Motions se on off hota hai.. curve hai..");
	}
	public void sound()
	{
		System.out.println("hain hi nhi :) ..");
	}
}
class MeraTV
{
	public static void main(String arpg[])
	{
		TV ob=new LG();
		ob.display();
		ob.sound();
		ob=new Samsung();
		ob.display();
		ob.sound();
		ob=new Sony();
		ob.display( );
		ob.sound();
	}

}




