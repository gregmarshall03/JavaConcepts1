import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class BankChargesLauncher {

	

	public static void main(String[] args) {
		double userInput;
		BankCharges charge1 = new BankCharges();
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		userInput = Double.parseDouble(JOptionPane.showInputDialog("Enter your balance: "));
		charge1.setbalance(userInput);
		
		
		userInput = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of checks written: "));
		charge1.setNumCheckWritten((int)userInput);
		
		
		JOptionPane.showMessageDialog(null, "BeginningBalance: " + formatter.format(charge1.getbalance()) + "\n" +
		"Number Of Checks Written: " + (int)charge1.getNumCheckWritten() + "\n" 
				+ formatter.format(charge1.getServiceFees()) + "\n" + "New account balance " + 
				formatter.format(charge1.getbalance() - charge1.getServiceFees()));
		System.exit(0);

	}

}
