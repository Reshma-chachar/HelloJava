package Reshma;

public class palindrom_number
{

	public static void main(String[] args)
	{
		int r,sum=0,temp;
		int n=1112;
		 temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
if(temp==sum)
{
	System.out.println("number is palindrom");
	}
else
{
	System.out.println("not palindrom");
}
	}
}
