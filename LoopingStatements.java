package session3;

public class LoopingStatements {

	public static void main(String[] args) {
		
		
		//While Loop
		int i=1;
		
		while(i<10)
		{
			System.out.println("Value of i: " +i++);
		}
		System.out.println("Final value of i: " +i);
		
		
		//DoWhile Loop 
		int j=10;
		
		do
		{
			System.out.println("Value of j: "+j--);
			
		}while(j>=1);
		System.out.println("Final value of j: " +j);
		
		
		//For Loop
		
		int k;
		for(  k=90;k>=1;k--)
		{
			System.out.println("value of k: " +k);
		}
		
	     System.out.println("Final value of k: " +k);
	     
	     
	    
	}
	
}
