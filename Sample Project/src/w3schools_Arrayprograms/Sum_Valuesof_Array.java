package w3schools_Arrayprograms;

public class Sum_Valuesof_Array {

	
	public static void sum_Of_Values(int[] intarray) {
		
		int sum = 0;
		for(int i=0;i<intarray.length;i++) 
		{	
			sum = sum + intarray[i];
		}
		System.out.println("Sum of array values:" + sum);
	}
	public static void main(String[] args) {
		
		sum_Of_Values(new int[]{1,2,3,4,5});
	

}
}