package Reshma;

public class swap_two_string
{

	public static void main(String[] args)
	{
		String st1="Good";
		String st2="Morning";
System.out.println("before swaping");
		System.out.println("string1\t"+st1+"string2"+st2);
		
		st1=st1+st2;
		st2=st1.substring(0,st1.length()-st2.length());
		
		st1=st1.substring(st2.length());
		System.out.println("\nstring1\t"+st1+"string2"+st2);

	}

}
