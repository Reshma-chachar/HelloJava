package Reshma;

public class each_word_reverse {

	public static void main(String[] args) 
	{
		String a="java code";
		String reverse=null;
		String out=null;
		  String[] words=a.split(" ");
		  for(String word:words)
		  {
		  for(int i=word.length();i>=0;i--)
		  {
			  reverse=reverse+word.charAt(i);
		  }
		  out=out+reverse;
		  
			  
		  }
	System.out.println(out+ " ");
	}
}



