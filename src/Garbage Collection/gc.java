class Student
{
	int a,b;
	public void setData(int c,int d)
	{
		a=c;
		b=d;
	}
	public void showData()
	{
		System.out.println("Value of a :"+a);
		System.out.println("Value of b :"+b);
	}
	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setData(1,2);
		s2.setData(3,4);
		s1.showData();
		s2.showData();
		//Student s3;
		//s3=s2;
		//s3.showdata();
		//s2=null;
		//s3.showData();
		//s3=null;
		//s3.showData();
	}
}