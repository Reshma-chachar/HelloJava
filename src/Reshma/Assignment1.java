package Reshma;

public class Assignment1 
{
   int roll;
   String name;
       public Assignment1()
       {
    	   System.out.println("non parameterised constructor");    	    
       }
       public Assignment1(int a,String b)
       {
    	    roll=a;
    	    name=b;
       }
       public void display()
       {
    	    System.out.println("The roll number of student="+roll);
    	    System.out.println("The Name of student=" +name );
       }
       
	public static void main(String[] args)
	{
		Assignment1 obj1=new Assignment1();
		Assignment1 obj2=new Assignment1(100,"Shubham");
             obj2.display();
             

	}

}
