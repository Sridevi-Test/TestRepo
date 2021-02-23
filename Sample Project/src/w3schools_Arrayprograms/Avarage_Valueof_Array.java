package w3schools_Arrayprograms;

public class Avarage_Valueof_Array {
	
	public static void averageof_Array(double[] doublearray) {
		double sum = 0;
		double average;
		for(int i=0;i<doublearray.length;i++)
		{
			sum =sum+doublearray[i];
		
		}
		
		average = sum/doublearray.length;    		
		System.out.println("Average of array elements:" + average);
	}

	public static void main(String[] args) {
		
		
		averageof_Array(new double[]
				
				{12.5,56.7,86.9,345.9});
		
	}

}
