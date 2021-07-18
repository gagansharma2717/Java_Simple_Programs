class PatternStar
{
public static void main(String args[])
{
for(int i=9;i>=1;i--)
{
for(int j=1;j<=9-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<i;k++)
{
	System.out.print(k);
}
for(int l=i;l>=1;l--)
{
	System.out.print(l);
}
System.out.println();
}
}
}
