//Write a java program to demonstrate hierarchical inheritance and implement SHAPE class
class SHAPE
{
	int h,w,d,r;
	void getvalue1(int x,int y,int z)
	{
		h=x;
		w=y;
		d=z;
	}
	void getvalue2(int x)
	{
		r=x;
	}
}
class AreaBox extends SHAPE
{
	int area;
	AreaBox(int x,int y,int z)
	{
		getvalue1(x,y,z);
	}
	void calcarea()
	{
		area=h*w*d;
	}
	void display()
	{
		System.out.println("Height : "+h);
		System.out.println("Width : "+w);
		System.out.println("Depth : "+d);
		System.out.println("Area : "+area);
	}
}
class AreaCircle extends SHAPE
{
	double area;
	AreaCircle(int x)
	{
		getvalue2(x);
	}
	void calcarea()
	{
		area=3.14*r*r;
	}
	void display()
	{
		System.out.println("Radius : "+r);
		System.out.println("Area : "+area);
	}
}
class INHERITANCE3
{
	public static void main(String args[])
	{
		AreaBox b1=new AreaBox(2,3,4);
		AreaCircle c1=new AreaCircle(5);
		b1.calcarea();
		c1.calcarea();
		System.out.println("Box : ");
		b1.display();
		System.out.println("\nCircle : ");
		c1.display();
	}
}