package w3schools_Arrayprograms;

public class Specificvalue_Array {

	
	public static void specific_value(int n) {
		
		int[] values = new int[] {34,8,10,49,22,80};
		
		for(int i=0;i<values.length;i++)
		{
			if(values[i]==n)
			{
				System.out.println("contains specific value:" +n);
				break;
			}
		} 	
		System.out.println("does'nt contains specific value:" +n); 
	}
	public static void main(String[] args) {
		
		specific_value(100);
		
		
		
	}

}
