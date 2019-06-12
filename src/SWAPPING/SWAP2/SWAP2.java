import java.util.Scanner;
class SWAP2
{
	int a,b;
	SWAP2 swap(int p,int q)
	{
		SWAP2 y=new SWAP2();
		y.a=p;
		y.b=q;
		int c;
		c=y.a;
		y.a=y.b;
		y.b=c;
		return y;
	}
	void display()
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
}
class SWAPPING
{
	public static void main(String args[])
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 Numbers : ");
		x=s.nextInt();
		y=s.nextInt();
		SWAP2 s1=new SWAP2();
		s1.a=x;
		s1.b=y;
		System.out.println("Before SWAP : ");
		s1.display();
		System.out.println("SWAPPING......");
		SWAP2 s2=s1.swap(s1.a,s1.b);
		System.out.println("After SWAP : ");
		s2.display();
	}
}