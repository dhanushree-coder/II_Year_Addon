package session3;

public class StringsEx {
	
	public static void main(String[] args) {
		
		
		String s1="Madhan";                       //string literal
		String s2=new String("Kumar");       //string object
		char[] c1= {'J','A','V','A'};           //array of characters
		String s3=new String(c1);         // char of strings
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		//String concatenation
		
		String a1="java ";
		String a2="Program ";
		String a3="Program ";
		String a4=a1+a2+a3;
		System.out.println("The concatenated stirng is:" +a4);
		
		
		//concatenation done in same reference variable without using a4
		

		String b1="java ";
		String b2="Program ";
		String b3="Program ";
	
		b1=b1+b3;
		System.out.println(b1);
		
		
		
	}

}
