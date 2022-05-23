package Reshma;

public class armstrong {

	public static void main(String[] args) 
	{
		int num=370,temp,number,total=0;
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+(temp*temp*temp);
			number=number/10;
					
		}
		if(total==num)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		
		
	}

}
