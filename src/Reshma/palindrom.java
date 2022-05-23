package Reshma;

public class palindrom {

	public static void main(String[] args) 
	{
		int n=110,r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);

	}

}
