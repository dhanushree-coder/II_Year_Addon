package programs;

import java.util.Scanner;

public class ConditionalStatement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		
		
		int age= sc.nextInt();
		
		//condition
		if(age>=18)
		{
			System.out.println("YOU ARE ELIGIBLE TO VOTE");
		}	
		else 
		{
				System.out.println("not eligible to vote");
		}
	}
	

}
