//Write a java program to access hidden variable using super keyword 
class A 
{
	static int x=5;
}
class HIDDENVAR extends A
{
	int x=10;
	void display()
	{
		System.out.println("Local X : "+x);
		System.out.println("Global X : "+super.x);
	}
	public static void main(String args[])
	{
		HIDDENVAR hv1=new HIDDENVAR();
		hv1.display();
	}
}