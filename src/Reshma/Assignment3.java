package Reshma;

public class Assignment3
{
	public static void main(String[] args) 
	{
		int marks=64;
		if(marks<35)
		{
			System.out.println("Fail");
		}
		else if (marks>=35 && marks<=50)
		{
			System.out.println("pass class");
		}
		else if(marks>=51 && marks<=59)
		{
			System.out.println("Higher Second class");
		}
		else if(marks>=60 && marks<=69)
		{
			System.out.println("First class");
		}
		else if(marks>=70)
		{
			System.out.println("First class with distinction");
		}
			
	}
	
}
