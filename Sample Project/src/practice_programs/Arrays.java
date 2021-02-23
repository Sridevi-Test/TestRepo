package practice_programs;
public class Arrays {

	public static void main(String[] args) {
		
	/*	int[] numbers = new int[4];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		
		System.out.println(numbers[3]);*/		
		//int[] numbers = { 70,20,80,40};		
		//char[] chararray = new char[] {'a','b','c','d'};		
		//String str = chararray.toString() ;		
		//System.out.println(str);
		//System.out.println(numbers);
		
	
		//Arrays.sort(numbers);
		
		int[][] twodimensional = new int[2][2];
		//int[][] doublearray = new int{{1,2,3},{4,5,6}};
		
		int doublearray[][] = {{1,2,2},{3,4,5}};
		
		twodimensional[0][0] = 10;
		twodimensional[0][1] = 20;
		twodimensional[1][0] = 30;
		twodimensional[1][1] = 40;
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				System.out.println(twodimensional[i][j]);
			}
		}
		max(new int[] {20,80,67,99,44,11});
		
		product(new int[] {1,2,3,4,41,5
				});
	
	}

	//twodimensional[][].length();
	
	public static int max(int[] intarray) {
			int maximum = intarray[0];
		for(int i=1;i<intarray.length;i++) {
			if(intarray[i] > maximum) 
			{
				maximum = intarray[i];
			}
			
		}
		System.out.println(maximum);
		return maximum;
	}
	
	public static void product(int[] prodarray) {
		int result = 1;
		
		int digit = 0;
			for(int i=prodarray.length-1;i>prodarray.length-3;i--) {
				result = result*prodarray[i]; 
			}			
			System.out.println(result);
			if(result>0)
			{
				
				int num = result%100;
				result = result/10;
				// digit = num*10+digit;
				System.out.println("digits are:" + num);
				//result = result/10;
			}
			
			//result = result/10;
			//System.out.println("digits are:" + digit);
		}
	}

