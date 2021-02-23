package practice_programs;

public class Constructorchainingtest extends Constructorchaining {
	
	public double salary;
	public char gender;
	public Constructorchainingtest(double salary , char gender ) {
		
		super(20 , "Ani");
		
		this.salary= salary;
		this.gender = gender;
		System.out.println(salary);
		System.out.println(gender);
		
	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructorchainingtest c = new Constructorchainingtest(200000.500 , 'F');
		
		
	}

}
