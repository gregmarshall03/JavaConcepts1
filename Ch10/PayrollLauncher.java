import java.util.Scanner;
public class PayrollLauncher  {

	

	public static void main(String[] args)throws EmptyName,InvalidID,InvalidHours,InvalidPayRate {
		Scanner keyboard = new Scanner(System.in);
		Payroll payroll = new Payroll();
		System.out.println("Who is on this payroll ? ");
		payroll.setName(keyboard.nextLine());
		System.out.println("What is your id number ? ");
		payroll.setIdNumber(keyboard.nextInt());
		System.out.print("What is your hourly pay rate ?");
		payroll.setPayRate(keyboard.nextDouble());
		System.out.println("How many hours did you work ? ");
		payroll.setHoursWorked(keyboard.nextInt());
		
		System.out.println("Your name is " + payroll.getName() + " Your id number is " + 
		payroll.getIdNumber() + " your hourly payrate is " + payroll.getPayRate()
		+ " the amount of hours that you worked is " + payroll.getHoursWorked());
		System.out.println(" Your grossPay is " + payroll.getGrossPay());
		
	
	
		
		
		

	}

}
