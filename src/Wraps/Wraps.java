//write a java program for boxing and unboxing of all wrapper classes
class Wraps
{
	public static void main(String args[])
	{
		Integer i1=new Integer(10);
		Byte b1=new Byte("100");
		Short s1=new Short("10000");
		Long l1=new Long(13);
		Float f1=new Float(14);
		Double d1=new Double(15);
		Boolean b2=new Boolean("String");
		Character c1=new Character('A');
		
		System.out.println("Boxed Values :\n\n");
		
		System.out.println("Integer :"+i1);
		System.out.println("Byte :"+b1);
		System.out.println("Short :"+s1);
		System.out.println("Long :"+l1);
		System.out.println("Float :"+f1);
		System.out.println("Double :"+d1);
		System.out.println("Boolean :"+b2);
		System.out.println("Character :"+c1);
		
		System.out.println("\n\nUnboxing of Values :");
				
		System.out.println("\n\nInteger :"+i1.floatValue());
		System.out.println("Byte :"+b1.doubleValue());
		System.out.println("Short :"+s1.shortValue());
		System.out.println("Long :"+l1.longValue());
		System.out.println("Float :"+f1.byteValue());
		System.out.println("Double :"+d1.intValue());
		System.out.println("Boolean :"+b2.toString());
		System.out.println("Character :"+c1.toString());
	}
}