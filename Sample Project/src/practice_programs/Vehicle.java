package practice_programs;

public abstract class Vehicle {
/*	public String type;
	public int doors;
	public int gears;
	
	public Vehicle(String t,int d , int g) {
		
		type=t;
		doors = d;
		gears = g;
		System.out.println(t + d + g);
	}*/
	
	public  abstract void start_engine();
	
	public abstract void run()	;
	
	public void gear() {
		
		System.out.println("changes the speed");
				}
	
	
	
}
