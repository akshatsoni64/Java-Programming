class UDException extends Exception
{
	private int x;
	UDException(int a)
	{
		x=a;
	}
	public String tostring()
	{
		return "Divide by zero error";
	}
}
class UserDefinedException
{
	static void div(int a,int b) throws UDException
	{
		if(b==0)
		{
			throw new UDException(a);
		}
		else
		{
			System.out.println("Division : "+(a/b));
		}
	}
	public static void main(String args[])
	{
		try 
		{
			div(10,0);
		}
		catch(UDException ude)
		{
			System.out.println(ude);
		}
	}
}