package Reshma;

public class seperate_string_from_number
{

	public static void main(String[] args) 
	{
		String st="abcd1234";
		String st1=st.replaceAll("[^A-Za-z]", " ");
		String st2=st.replaceAll("[^0-9]", " ");
		System.out.println("String is"+st1);
		System.out.println("Number is"+st2);
		

	}

}
