//Program to find Second maximum Numbers
import java.util.Scanner;
class Secmax
{
	public static void main(String args[])
	{
		int n,i;
		int max=0;
		int temp=0;
		int max2=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Limit :");
		n = s1.nextInt();
		System.out.println("Enter "+n+" Numbers :");
		for(i=0;i<n;i++)
		{
			temp=s1.nextInt();
			if(temp>max)
			{
				max2=max;
				max=temp;
			}
			else if(temp>max2)
			{
				max2=temp;
			}
		}
			System.out.println("Second Max No. is : "+max2);
	}
}