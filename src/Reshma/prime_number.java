package Reshma;

public class prime_number 
{
	public static void main(String[] args)
	{
		int n=10;
		int count=0;
		for (int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		//System.out.println(count);
		if(count>0)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}
	}
}
