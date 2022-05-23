package Reshma;

public class second_largest_number_array 
{

	public static int largest(int[] a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		return a[total-2];
	}
	public static void main(String[] args) 
	{
		int a[]= { 3 ,2, 9, 7 };
		int b[]= { 90,67,23,99};
		System.out.println("largest number"+largest(a,4));
		System.out.println("Largest number"+largest(b,4));
		
		

	}

}
