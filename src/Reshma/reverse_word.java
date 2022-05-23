package Reshma;

public class reverse_word {

	public static void main(String[] args)
	{
		String str="India is my country";
		String str1=null;
		String a[]=str.split(" ");
	/*	for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+ " ");
			
		}*/
		for (int i=a.length-1;i>=0;i--)
		{
			 str1=a[i];
			System.out.println(str1+" ");
			
		}

	}

}
