//Write a java program to demonstrate accessing super class constructor and implement BOX class and calculate area
class Box
{
	int h,w,d;
	Box(int x,int y,int z)
	{
		h=x;
		w=y;
		d=z;
		System.out.println("Height : "+h);
		System.out.println("Width : "+w);
		System.out.println("Depth : "+d);
	}
}
class Area extends Box
{
	int area;
	Area(int x,int y,int z)
	{
		super(x,y,z);
	}
	void calcarea()
	{
		area=h*w*d;
	}
	void display()
	{
		System.out.println("Area of Box : "+area);
	}
}
class SUPERCONST
{
	public static void main(String args[])
	{
		Area a1=new Area(3,5,7);
		a1.calcarea();
		a1.display();
	}
}