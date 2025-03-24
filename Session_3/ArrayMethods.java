package session3;
import java.util.Arrays;

public class ArrayMethods {
	
	public static void main(String[] args) {
		
		
		//Length of the Array
		int[] num= {10,20,30,40,50};
		System.out.println("Length of the num: " +num.length);
		
		System.out.println();
		
		//Copying an Array
		int[] source= {1,2,3,4,5};
		int[] destination= new int[5];
		
		//Copy Array
		System.arraycopy(source,0,destination,0,source.length);
		
		for(int i:destination)
		{
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		//3.Array
		int[] b= {12,8,6,45,2};
		Arrays.sort(b);
		
		
		System.out.println(Arrays.toString(b));
		
		//4.Array fill
		int[] d=new int[5];
		Arrays.fill(d, 1);
		Arrays.fill(d, 1,4,2);
		System.out.println(Arrays.toString(d));
	}

}
