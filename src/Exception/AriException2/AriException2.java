class AriException2
{
	public static void main(String args[])
	{
		int a=10;
		try
		{
			a=a/0;
		}
		catch(ArithmeticException E1)
		{
			System.out.println("Divide by Zero");
		}
		System.out.println("Hello World");
	}
}