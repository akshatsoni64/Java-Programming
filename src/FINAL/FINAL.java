import java.util.Scanner;
class FINAL
{
	final static double PI=3.14;
	public static void main(String args[])
	{
		int r;
		double area=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Radius : ");
		r=s1.nextInt();
		area=PI*r*r;
		System.out.println("Area : "+area);
	}
}