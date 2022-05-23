package Reshma;
public class colllege
{
   int roll;
   String name;
    public colllege()
       {
         System.out.println("welcome to constructor");
        }  
    public colllege(int a,String b)
    {
            roll=a;
            name=b; 
       }
    public void display()
    {
    System.out.println(name+" "+roll);
    }
    
          
       
public static void main(String[] args) 
	
	{
	  colllege obj=new colllege();
	    colllege obj1=new colllege(1,"Reshma");
	        colllege obj2=new colllege(2,"Shubham");
	         obj1.display();
	         obj2.display();
		//System.out.println("welcome");
	}
}


