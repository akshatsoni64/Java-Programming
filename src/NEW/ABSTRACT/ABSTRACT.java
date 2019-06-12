abstract class ABST
{
	ABST()
	{
		System.out.println("This is Abstract(Super) Class Constructor");
	}
}

class ABSTX extends ABST
{
	ABSTX()
	{
		super();
		System.out.println("This is Subclass Constructor");
	}
}

class ABSTRACT
{
	public static void main(String args[])
	{
		ABSTX a1= new ABSTX();
	}
}