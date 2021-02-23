package w3schools_Arrayprograms;

import java.util.Arrays;

public class Sort_Array {

	public static void main(String[] args) {
		
		int[] intarray = {67,34,89,99,12,23,889,111,456};
		
		String[] strarray = { "Java" ,"Selenium","arrays","Practice","Programs","work"};
		Arrays.sort(intarray);
		Arrays.sort(strarray);
		System.out.println("sorted int array:" + Arrays.toString(intarray));
		System.out.println("Sorted stringarray:" + Arrays.deepToString(strarray));
	}

}
