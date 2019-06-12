//Write a java program to implement BOX class and calculate area and use multiple inheritance
import java.util.Scanner;
interface BOX
{
	int h=0,w=0,d=0;
	void calcarea();
}
interface AREA
{
	double area=0;
	void display();
}
interface BOXAREA extends BOX,AREA
{}
class DEMOINTERFACE implements BOXAREA
{
	int h,w,d;
	double area;
	DEMOINTERFACE(int x,int y,int z)
	{
		h=x;
		w=y;
		d=z;
	}
	public void calcarea()
	{
		area=h*w*d;
	}
	public void display()
	{
		System.out.println("Area of Box : "+area);
	}
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Height:");
		a=s.nextInt();
		System.out.print("Enter Width:");
		b=s.nextInt();
		System.out.print("Enter Depth:");
		c=s.nextInt();
		DEMOINTERFACE di1=new DEMOINTERFACE(a,b,c);
		di1.calcarea();	
		di1.display();
	}
}