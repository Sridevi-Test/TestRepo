package practice_programs;

public class Employee {
	public int H;
	public int empAge;
	public String empname;
	public double empsalary;
	
	public Employee(int empAge, String empname , double empsalary) {
		this.empAge = empAge;
		this.empname = empname;
		this.empsalary = empsalary;
		
	}
	
	public void emp_work_hours() {
		System.out.println(empAge);
		System.out.println("Emp work hours are :" +H);
	}
	
	public void emp_Work_Days() {
		System.out.println(empname);
		System.out.println("Emp work days are 5 in a week");
	}
	
	public int emp_work_hours(int H) {
		this.H = H;
		System.out.println(empsalary);
		return H;
		//System.out.println(H);
	}
	
	public void emp_work_hours(int H ,int extraH) {
		
		System.out.println("benefits for extra hours");
		
		
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E = new Employee(35,"eee",55555.72);
		
		E.emp_work_hours(10);
		E.emp_work_hours();
		E.emp_Work_Days();
		E.emp_work_hours(8, 10);
		
		
		

	}

}
