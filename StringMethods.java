package session3;

import java.util.Scanner;

public class StringMethods {
	
	
	public static void main(String[] args) {
		
		
		String s1="Java Program";
		//1.Length
		System.out.println(s1.length());
		
		
		//2.Equals
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the UserName: ");
		String username=sc.nextLine();

		System.out.println("Enter Password: ");
		String password =sc.next();
		
		if(username.equals("admin") && password.equals("admin@123"))
		{
			
			System.out.println("Success");
			
		}
		else
		{
			
			System.out.println("Error 404 Not Found");
			
		}
		
		
		
		//3.EqualsIgnore Case
		
				Scanner bc=new Scanner(System.in);
				
				System.out.println("Enter the UserName: ");
				String usrnm=bc.nextLine();

				System.out.println("Enter Password: ");
				String psd =bc.next();
				
				if(usrnm.equalsIgnoreCase("admin") && psd.equalsIgnoreCase("admin@123"))
				{
					
					System.out.println("Success");
					
				}
				else
				{
					
					System.out.println("Error 404 Not Found");
					
				}
				
				
		//Comparing two strings using equals
				String b1="MadhanKumar";
				String b2="MadhanKumar";
				
				System.out.println(b2.equals(b1));    //literal
				
				
				
		// same methods using == operator
				String b3="MadhanKumar";
				String b4="MadhanKumar";
				
				System.out.println(b4==b3);    //equalto operator
				
		// compare to
				
				//b6>b7-->positive number
				//b6<b7-->negative number
				//b6==b7-->0
				
				String b6="hiii";
				String b7="hello";
				
				System.out.println(b6.compareTo(b7));
				
				
				
		//using the String object will not compare any of the string
				String name = new String("MadhanKumar");
				String name1 = new String("MadhanKumar");
				
				System.out.println(name==name1);
				
		
		//concat ()
				String str1="static";
				String str2=new String("Program");
				
				System.out.println(str1.concat(str2));
				
		//toCharArray()
				String str3="welcome to java";
				System.out.println("value of method: ");
				char[] ch=str3.toCharArray();
			//converting a string into the single letter	
				
				for(char st:ch)
				{
					System.out.println(st);
				}
		
				
				
		//subString()
				System.out.println(str3.substring(5));
		//giving start index and end index
				System.out.println(str3.substring(0,9));
				
				
		//intern
				String clg="Kgisl";
				String clg1=new String("Kgisl");
				String str4=clg1.intern();
				
		//converting the string object into intern using intern
                System.out.println(clg==str4);

				
				
				
				
	}

}
