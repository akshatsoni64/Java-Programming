import java.util.Scanner;
class MatrixMul
{
	public static void main(String args[])
	{
		int l;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Array Base :");
		l=s.nextInt();
		
		int a[][]=new int[l][l];
		int b[][]=new int[l][l];
		int c[][]=new int[l][l];
		
		System.out.println("Enter two Matrix");
		System.out.println("A :");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("B :");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				System.out.print("b["+i+"]["+j+"] = ");
				b[i][j]=s.nextInt();
			}	
		}
		
		System.out.println("\nMultiplicated Matrix :\n");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				for(int k=0;k<l;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					
				}
				System.out.print(c[i][j]+"\t");
			}	
			System.out.print("\n");
		}
	}
}