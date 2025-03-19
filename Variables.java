package programs;

public class Variables {
int a=25; //instance
static int b=50; //static


public static int print()
{
int mark=90;
return mark;
}


void display()
{
	int d=60; //local
	System.out.println("method inside variable:"+d);
}

public static void main(String[] args) {
int c=75; //local

Variables obj1=new Variables();
System.out.println(obj1.a);
obj1.display();
System.out.println(b);
System.out.println(c); 


System.out.println(print());

Variables2 obj2=new Variables2();
obj2.students();

Variables2.show();
}
}
