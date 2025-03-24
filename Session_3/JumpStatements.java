package session3;

public class JumpStatements {
	
	public static void main(String[] args) {
	
		//Break Statement
		int i=1;
		while(i<10)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		
		//Continue Statement
		int j=1;
		while(j<10)
		{
			if(j==5)
			{
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}

		
		
	}

}
