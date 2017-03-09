
public class Payroll {
	private String name;
	private int idNumber;
	private double payRate;
	private int hoursWorked;

	public Payroll(String name, int idNumber, double payRate, int hoursWorked) throws EmptyName, InvalidID,InvalidHours,InvalidPayRate  {
		this.name = name;
		this.idNumber = idNumber;
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
		
		
		
	
	}
	public Payroll(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws EmptyName {
		if(name.equals("")){
			throw new EmptyName();
		}
		
		this.name = name;
		
	}

	public int getIdNumber()  {
		
		return idNumber;
	}

	public double setIdNumber(int idNumber) throws InvalidID {
		if(idNumber < 0){
		
		throw new InvalidID();
		}
		this.idNumber = idNumber;
		return idNumber;
	}

	public double getPayRate() {
		return payRate;
		
	}

	public void setPayRate(double setPayRate) throws InvalidPayRate {
		if(setPayRate < 0 || setPayRate >= 25){
			throw new InvalidPayRate();
			
		}
		this.payRate = payRate;
		
			
	}
		

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked)  throws InvalidHours {
		if(hoursWorked <0 || hoursWorked >= 84  ){
			throw new InvalidHours();
		}
		this.hoursWorked = hoursWorked;
	}
	public double getGrossPay(){
		return hoursWorked*payRate;
	}

	
}
