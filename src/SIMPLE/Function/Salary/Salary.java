import java.util.Scanner;
class Salary
{
	int basic;
	double hra,da,sal;
	
	public void sal(int bs)
	{
		basic = bs;
		hra = basic * 0.20;
		da = basic * 0.10;
		sal = basic + hra + da;
		System.out.println(" Net Salary is : " + sal);
	}
}

class SalCalc
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		Salary e = new Salary();
		System.out.println("Enter Basic Salary : ");
		e.basic = s1.nextInt();
		e.sal(e.basic);		
	}
}