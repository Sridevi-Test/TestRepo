package practice_programs;

public class Car extends Vehicle {
	
	public void start_engine() {
		System.out.println(" engine starts when it is on");
	}
	
	public void run() {
		 System.out.println("when we press accelerator");
	}
	
	public void stop_engine() {
		System.out.println("engine stops when it's off");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Car();
		
		v.start_engine();
		v.run();
		v.gear();

	}

}
