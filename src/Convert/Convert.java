//Program to convert Number to String :
import java.util.Scanner;
class Convert
{
	public static void main(String args[])
	{
		int a,b,sum;
		Integer i1=new Integer(args[0]);
		Integer i2=new Integer(args[1]);
		a=i1.intValue();
		b=i2.intValue();
		sum=a+b;
		System.out.println("Addition : "+sum);
	}
}