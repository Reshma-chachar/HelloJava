package Reshma;

public class character_occurances {

	public static void main(String[] args)
	{int count=0;
		String str1="aaaaabbbbeeee";
		char search='e';
		for(int i=0;i<str1.length();i++)
		{ 
			if(str1.charAt(i)==search)
			{
				count++;
				
			}
		}System.out.println(count);
	}

}
