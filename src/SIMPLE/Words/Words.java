class Words
{
	public static void main(String args[])
	{
		String s1="This is a String in program";
		int c=0;
		int len;
		System.out.println(s1);
		len=s1.length();
		
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(i)==' ')
			{
				c++;
			}
		}
		System.out.println("No. of Words : "+(c+1));
	}
}