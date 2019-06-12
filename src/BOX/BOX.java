import java.util.Scanner;
class BOXVAL
{
	int h,w,d;
	public void initialize(int x,int y,int z)
	{
		h=x;
		w=y;
		d=z;
	}
	public float volume()
	{
		int vol;
		vol=h*w*d;
		return vol;
	}
}
class BOX
{
	public static void main(String args[])
	{
		int h,w,d;
		float vol;
		Scanner s1=new Scanner(System.in);
		BOXVAL bv1=new BOXVAL();
		
		System.out.println("Enter Height : ");
		h=s1.nextInt();
		
		System.out.println("Enter Width : ");
		w=s1.nextInt();
		
		System.out.println("Enter Depth : ");
		d=s1.nextInt();
		
		bv1.initialize(h,w,d);
		vol=bv1.volume();
		System.out.println("Volume : "+vol);
	}
}