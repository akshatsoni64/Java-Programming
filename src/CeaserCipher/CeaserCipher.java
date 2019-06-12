import java.util.Scanner;
class CeaserCipher
{
		public static void main(String args[])
		{
			char om[],em[];
			om=new char[30];
			em=new char[30];
			Scanner s1=new Scanner(System.in);

			System.out.println("Enter Original Text : ");
			for(int i=0;om[i]!=' ';i++)
			{
				om[i]=s1.next().charAt(i);
			}
			for(int i=0;om[i]!=' ';i++)
			{
				if(om[i]==' ')
				{
					em[i]=' ';
				}
				else if(om[i]>='a'&& om[i]<='z')
				{
					em[i]=om[i]+3;
					if(em[i]>'z')
					{
						em[i]=em[i]-26;
					}
				}
				else
				{
					em[i]=om[i]+3;
					if(em[i]>'Z')
					{
						em[i]=em[i]-26;
					}
				}
			}
			em[i]=' ';
			System.out.println("Your Original text : "+om);
			System.out.println("Your Encrypted text : "+em);
		}
}