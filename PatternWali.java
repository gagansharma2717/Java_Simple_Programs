class PatternWali
{
public static void main(String args[])
{
	int temp =0;
		for(int i=1;i<=4;i++)
{
		for(int j=1;j<=4;j++)
		{
			
			if(j<i)
			System.out.print(" ");
			else
			{
			temp++;	
			System.out.print(temp);
			}
		}
System.out.println(" ");
}
}
}