package Session5;

public class AccessPerson {

	public static void main(String[] args) {
		
		//original person object
		Person originalPerson=new Person("Madhan",18);
		
		
		
		
		
		//Copied Person object
		Person copiedPerson=new Person(originalPerson); //object Dependency		
		
		
		
		System.out.println("Original Person: ");
		originalPerson.displayInfo();
		
		
		System.out.println("Copied Person: ");
		copiedPerson.displayInfo();
		
		
		
	}
	
	
	
	
}
