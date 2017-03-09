
public class EmployeeLauncher {

	public static void main(String[] args) {
		ProductionWorker worker = new ProductionWorker();
		
		worker.setEmployeeName("Greg"); // add employee name
		
		worker.setEmployeeNumber("0711-G"); // add employee id		
		
		worker.setHireDate("07/11/2017"); // add hire date
		
		worker.setShift(1); // add shift
		
		worker.setPayRate(45.00); // add payRate
		
		ShiftSupervisor supervisor = new ShiftSupervisor();
		
		supervisor.setEmployeeName("Ark");
		supervisor.setEmployeeNumber("1003-B");
		
		supervisor.setHireDate("10/03/2010");
		
		supervisor.setAnnualSalary(10000.0);
		
		System.out.println();
		
		supervisor.setAnnualBonus(15000.0);
		
		System.out.println(worker);
		
		System.out.println();
		
		System.out.println(supervisor);
		
		
		TeamLeader leader = new TeamLeader();
		leader.setEmployeeName("Jack");
		leader.setEmployeeNumber("5678-I");
		leader.setHireDate("01/23/2020");
		leader.setShift(2);
		leader.setPayRate(15.00);
		leader.setMonthlyBonus(350.0);
		leader.setRegTrainingHours(40.0);
		leader.setTraningAttended(39.0);
		
		System.out.println();
		
		System.out.println(leader);
}		

}
