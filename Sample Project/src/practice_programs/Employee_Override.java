package practice_programs;

public class Employee_Override extends Employee{
	
	public double empextra_salary;
	public double emp_totalsalary;
	
	public Employee_Override(double es , double et) {
		
		super(40,"hhh",35000);
		empextra_salary = es;
		emp_totalsalary = et;
		
		
	}
	
	public void emp_work_hours(int H ,int extraH) {
		
		int total_hours = H+extraH;
		System.out.println(total_hours);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Override Eo = new Employee_Override(1000,35000);
	    Employee e = new Employee_Override(1000,35000);
	    Eo.emp_work_hours(8, 2);
	    e.emp_work_hours(8, 3);
		

	}

}
