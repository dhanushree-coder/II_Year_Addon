package Session5;

public class Exception {

	
	String str1="123";
	
	
	public void name()
	{
		try 
		{
		int i=Integer.parseInt(str1);
		System.out.println("The value of converted string:"+str1);
		}
		
		catch(Exception e)
		{
		
		e.printStackTrace();
		
		
		
		}
	}
	
	public static void main(String[] args) {
		Exception ee=new Exception();
		ee.name();
	}
	
}
