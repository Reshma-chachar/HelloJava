package Reshma;

public class count_space
{

	public static void main(String[] args) 
	{
		String a="hello world java";
		int s=0;
		for(int i=0;i<a.length();i++)
		{
			char aa=a.charAt(i);
			if(aa==' ')
			{
				s++;
			}
		}
		System.out.println(s);

	}

}
