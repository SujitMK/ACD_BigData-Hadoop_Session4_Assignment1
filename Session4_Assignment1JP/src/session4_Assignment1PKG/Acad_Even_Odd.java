package session4_Assignment1PKG;

import java.util.Scanner;

public class Acad_Even_Odd {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for a : " );
		int a = scan.nextInt();
	    
		System.out.println("Enter value for b : " );
		int b = scan.nextInt();
		
		if(b < a)
		{
			System.out.println("Sorry, b value is less than a. Please try again. " );
		}
		else
		{	
			System.out.println();
		    System.out.println("EVEN Numbers Between "+a+" and "+b+" are :");
		    		
		    for (int i = a;i<=b;i ++)
		    {

		       if ((i % 2) == 0)
		       {
		         System.out.println(i);
	           }
		    }
		    
		    System.out.println();
		    System.out.println("ODD Numbers Between "+a+" and "+b+" are :");
		    
		    for (int i = a;i<=b;i ++)
		    {
		       if((i % 2) != 0)
		      {
		         System.out.println(+i);
		      }
		    }
		 }
    }
}