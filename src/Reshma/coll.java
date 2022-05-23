package Reshma;

public class coll

{
	   static String name;
	 static int age;
	protected  static void addition(String  a,int b)
{ 
		
		name=a;
		age=b;		
                System.out.println(name +"  "+age );
}

	public static void main(String[] args)
{
		coll obj=new coll();
		 obj.addition("Reshma",30);
		 obj.addition("Raj",30);
		 
		 coll.addition("alok", 40);
		 addition("Neelima",60);
		 

}

}
