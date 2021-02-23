package practice_programs;

public class costructor {
	
	int Employeeid;
	int Employeesalary;
	
	public costructor(int Employeeid , int Employeesalary) {
		
		this.Employeeid = Employeeid;
		this.Employeesalary = Employeesalary;
		System.out.println(Employeeid);
		System.out.println(Employeesalary);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	costructor c = new costructor(72,125001)	;
		
	}
	
	

}
