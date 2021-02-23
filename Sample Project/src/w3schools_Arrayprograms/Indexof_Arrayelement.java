package w3schools_Arrayprograms;

public class Indexof_Arrayelement {

	
	public  static int indexof_Element(int[] values, int n) {
		
		if (values==null) 
		{
			return -1;
			
		}
		
		int i=0;
		int len=values.length;
		while(i<len) {
			if(values[i]==n) {
				return i;
				//i=i+1;
			}
			i=i+1;
			return-1;
		}
			
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		//indexof_Element("full");
	}

}
