class A
{
	int a;
	A(int x)
	{
		this.a=x;
	}
	void display()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
{
	int b;
	B(int x,int y)
	{
		super(x);
		this.b=y;
	}
	void display()
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
}
class OVERRIDE
{
	public static void main(String args[])
	{
		B b1=new B(10,20);
		b1.display();
	}
}