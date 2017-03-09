import javax.swing.JOptionPane;
public class FatGramLauncher {

	

	public static void main(String[] args) {
		double userInput;
		FatGram gram1 = new FatGram();
		userInput = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of grams: "));
		gram1.setFatGrams(userInput);
		userInput = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of calories: "));
		gram1.setNumCalories(userInput);
		JOptionPane.showMessageDialog(null, "The number of calories from fat " + gram1.getCaloriesFromFat() + "\n" + gram1.getPercentage());
		
		
	}

}
