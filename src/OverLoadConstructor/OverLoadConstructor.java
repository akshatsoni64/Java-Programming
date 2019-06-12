import java.util.Scanner; 
class OverLoadConstructor
{
	int a,b;
	OverLoadConstructor()
	{
		System.out.println("Object1 : This is default constructor");
		System.out.println("Blank Object Created");
	}
	OverLoadConstructor(int x,int y)
	{
		System.out.println("Object2 : This is parameterised constructor");
		a=x;
		b=y;
	}
}
class OLC
{
	public static void main(String args[])
	{
		int p,q;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 2 Numbers : ");
		p=s1.nextInt();
		q=s1.nextInt();
		
		OverLoadConstructor olc1=new OverLoadConstructor();
		OverLoadConstructor olc2=new OverLoadConstructor(p,q);
		System.out.println("A : "+olc2.a);
		System.out.println("B : "+olc2.b);
	}
}