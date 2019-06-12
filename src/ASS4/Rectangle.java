class Rectangle
{
	int l,b;
	Rectangle(int x,int y)
	{
		l=x;
		b=y;
		System.out.println("Length : "+l);
		System.out.println("Breadth : "+b);
	}
	void area()
	{
		double area;
		area=l*b;
		System.out.println("Area of Rectangle : "+area);
	}
	
	void perimeter()
	{
		double pmtr;
		pmtr=2*(l+b);
		System.out.println("Perimeter of Rectangle : "+pmtr);
	}
}
class Square extends Rectangle
{
	Square(int x,int y)
	{
		super(x,y);
	}
	void area()
	{
		super.area();
		double area;
		area=l*l;
		System.out.println("Area of Square : "+area);
	}
	
	void perimeter()
	{
		super.perimeter();
		double pmtr;
		pmtr=4*l;
		System.out.println("Perimeter of Square : "+pmtr);
	}
}
class Main
{
	public static void main(String args[])
	{
		Square s1=new Square(3,4);
		s1.area();
		s1.perimeter();
	}
}