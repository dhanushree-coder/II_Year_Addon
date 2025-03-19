package session3;

public class Arrays {

public static void main(String[] args) {
	
	String[] names= {"Sachin","Virat Kholi","Dhoni"};
    System.out.println(names[1]);

	System.out.println();
	
	
	
	
//Accessing All Elements in the String Using the For Loop	
	
	for(int i=0;i<names.length;i++)
	{
		System.out.println(names[i]);
	}
	//ForEach Loop
	
	for(String i: names) {
		System.out.println(i);
	}
	
}

}
