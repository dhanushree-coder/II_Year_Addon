package Session5;

public class OverLoading {
	
	int c;
	
	public void add(int a,int b)
	{
		
		c=a+b;
		System.out.println("The value of integr c is: "+c);
		
	}
	
	
	
	public void add(float a,int b)
	{
		float c=a+b; //local variable
		System.out.println("The value of float c is: "+c);
		
	}
	
	
	public void add(float a,double b)
	{
		double c=a+b; //local variable
		System.out.println("The value od double c is: "+c);
	}
	
	
	public static void main(String[] args) {
		
		OverLoading ole=new OverLoading();
		ole.add(25, 10);
		ole.add(32.5f,10);
		ole.add(10.54f, 12.25478);
		
	}
	
	
	

}
