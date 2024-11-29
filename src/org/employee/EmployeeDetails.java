package org.employee;

public class EmployeeDetails { // body or block of the class
	
	private void empName() {
		// implementation details or business logic
		// double quotes "" -> String: predefined class
		System.out.println("Employee name Anand");
	}
	
	private void empId() {
		System.out.println("employee id: 1122");
	}
	
	private void empAdd() {
		System.out.println("address: chennai");
	}
	private void empMobile() {
		System.out.println("mobile: 7200983432");
	}
	// needed methods
//<<<<<<< HEAD	
//======
//>>>>>>> 94f5dba5b8e9e0728279383792cc79ed29f407f
	
	public static void main(String[] args) {
		
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empId();
		
	}
	

}
