class MyTHREAD1 extends Thread
{
	String s1=null;
	MyTHREAD1(String s)
	{
		s1=s;
		start();
	}
	public void run()
	{
		System.out.println(s1);
	}
}

class THREAD1
{
	public static void main(String args[])
	{
		MyTHREAD1 mt1=new MyTHREAD1("Thread 1");
	}
}
