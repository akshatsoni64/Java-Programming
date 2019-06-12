class STATIC
{
	static int id=0;
	static void print()
	{
		id++;
		System.out.println(id);
	}
	public static void main(String args[])
	{
		print();
	}
}