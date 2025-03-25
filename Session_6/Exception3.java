package Session_6;

public class Exception3 {

	static void validateAge(int age)
	{
		if (age<18)
		{
			throw new IllegalArgumentException("Age is must be above 18 or above");
			
		}
		else
		{
			System.out.println("Age is valid");
		}
	}
	
	public static void main(String[] args) {
		
		
		try
		{
			validateAge(3);
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Caught an exception:" +e.getMessage());
		}
		
	}
	
}
