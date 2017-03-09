
public class Employee {
	private String employeeName;
	private String employeeNumber;
	private String hireDate;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Employee() {
		
		
	}
	
	public String toString(){
		String str;
		str = "Employee Name: " + this.getEmployeeName() + "\n" +
				"Employee ID: " + this.getEmployeeNumber() + "\n" +
				"Hire Date: " + this.getHireDate();
		return str;
		
	}

}
