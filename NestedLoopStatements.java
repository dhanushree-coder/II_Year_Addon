package session3;

import java.util.Scanner;

public class NestedLoopStatements {
	
	
	public static void main(String[] args)
	{
		int j;
		
		for(int i=1; i<=4; i++)
		{
			for( j=1; j<=4; j++)
			{
				System.out.print(i+ " " +j);
			}
			System.out.println();
		}
		
		
		// Triangle Pattern printing
		for(int q=1;q<=5;q++)
		{
			for(int r=1;r<q+1;r++)
			{
				System.out.print(r+" ");
				
			}
			System.out.println();
		}
		
		//Pattern Printing
		int num=6; //rows
		
		for(int a=0;a<=num;a++)
		{
	   		for(int b=1;b<=num-a;b++)
			{
				System.out.print("* ");
			}
	   		System.out.println();
		}
		
	
		    
		
	    //Diamond Pattern Printing
	 
	        Scanner sc=new Scanner(System.in);
	        
	       System.out.println("Enter the number of rows:");
	       
	       int rows=sc.nextInt();
	       
	       //Top Half of diamond
	       for(int x=1;x<=rows;x++) 
	       {
	    	   //leading spaces
	    	   for(int y=x;y<rows;y++) 
	    	   {
	    		System.out.print(" ");
	    	   }
	    	   
	    	   //print *
	    	for(int z=1;z<=(2*x-1);z++)
	    	{
	    		System.out.print("*");
	    	}
	    		   System.out.println();
	    		   
   	    	   }
	       
	       //Second Half of diamond
	       for(int x=rows-1;x>=1;x--) 
	       {
	    	   //leading spaces
	    	   for(int y=rows;y>x;y--) 
	    	   {
	    		System.out.print(" ");
	    	   }
	    	   
	    	   //print *
	    	for(int z=1;z<=(2*x-1);z++)
	    	{
	    		System.out.print("$");
	    	}
	    		   System.out.println();
	    		   
   	    	   }

	       
	       
	       
	       
	       
	       
	       }
	

	    
		
	}

