package practice_programs;

import net.bytebuddy.asm.Advice.This;

public class Constructorchaining {

	
	public int Age;
	public String Name;
	
	
	public Constructorchaining(int A , String N) {
		
		this(5);
		Age = A;
		Name = N ;
		System.out.println(Age);
		System.out.println(Name);
		
		
	}
	
	public Constructorchaining(int A) {
		
		System.out.println(A);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorchaining R = new Constructorchaining(10,"Sri");
		

	}

}
