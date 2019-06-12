//Write a java program to demonstrate multiple inheritance using interface and implement shape class to calculate area
interface ISHAPE
{
	int h=0,w=0,d=0;
	void calcarea();
}
interface IAREA
{
	double area=0;
	void display();
}
interface ISHAPEAREA extends ISHAPE,IAREA
{}

class SHAPE implements ISHAPEAREA
{
	int h,w,d,area;
	SHAPE(int x,int y,int z)
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
		System.out.println("Height : "+h);
		System.out.println("Width : "+w);
		System.out.println("Depth : "+d);
		System.out.println("Area : "+area);
	}
}
class MultiInterface
{
	public static void main(String args[])
	{
		SHAPE s=new SHAPE(2,3,4);
		s.calcarea();
		s.display();
	}
}