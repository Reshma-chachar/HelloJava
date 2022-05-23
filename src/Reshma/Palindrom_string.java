package Reshma;

public class Palindrom_string 
{

	public static void main(String[] args)
	{
		String str="anna";
		StringBuffer buffer=new StringBuffer(str);
		buffer.reverse();
		String data=buffer.toString();
		if(str.equals(data))
		{
			System.out.println("string palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}

	}

}
