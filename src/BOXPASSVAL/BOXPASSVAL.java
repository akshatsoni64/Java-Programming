import java.util.Scanner;
class BOXPASSVAL
{
	int h,w,d;
	public void initialize(int x,int y,int z)
	{
		h=x;
		w=y;
		d=z;
	}
	public void volume()
	{
		float vol;
		vol=h*w*d;
		System.out.println("Volume : "+vol);
	}
}
class BOX
{
	public static void main(String args[])
	{
		int h,w,d;
		Scanner s1=new Scanner(System.in);
		BOXPASSVAL bv1=new BOXPASSVAL();
		
		System.out.println("Enter Height : ");
		h=s1.nextInt();
		
		System.out.println("Enter Width : ");
		w=s1.nextInt();
		
		System.out.println("Enter Depth : ");
		d=s1.nextInt();
		
		bv1.initialize(h,w,d);
		bv1.volume();
	}
}