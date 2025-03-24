package Session5;

public class AccessFoodMenu implements VegItems,NonVegItems {

	@Override
	public void fry() {
           System.out.println("Chicken fry,Prawn fry,Mutton fry,Fish fry");		
	}

	@Override
	public void gravy() {
		   System.out.println("Chicken gravy,Prawn gravy,Mutton gravy,Fish gravy");
		
	}

	@Override
	public void breakFast() {
	       System.out.println("Idly,Dosa,Pongal,etc.....");	
	}

	@Override
	public void lunch() {
		   System.out.println("Tomato Rice,curd rice,Meals etc....");
		
	}
	
	public static void main(String[] args) {
		
		
		AccessFoodMenu afm=new AccessFoodMenu();
		afm.breakFast();
		afm.fry();
		afm.gravy();
		afm.lunch();
		
		
	}
	
	

}
