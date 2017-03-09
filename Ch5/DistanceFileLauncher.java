import java.io.*;

import javax.swing.JOptionPane;

public class DistanceFileLauncher {

	public static void main(String[] args) throws FileNotFoundException {
		double vehicleSpeed;
		double timeTraveled;
		DistanceFile distance1 = new DistanceFile();
		vehicleSpeed = Double.parseDouble(JOptionPane.showInputDialog("Please enter the speed at which the car is going:"));
		while(vehicleSpeed < 0){
			vehicleSpeed = Double.parseDouble(JOptionPane.showInputDialog("Invalid Data Re-Enter the speed at which the car is going:"));
		}
		timeTraveled = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of hours driven"));
		while(timeTraveled < 1){
			timeTraveled = Double.parseDouble(JOptionPane.showInputDialog("Invalid Data Please Re-Enter the amount of hours driven"));
		}
		distance1.setSpeed(vehicleSpeed);
		PrintWriter outputWriter = new PrintWriter("C://Users//Greg//Desktop//DistanceFile.txt");
		
		outputWriter.println("Hours\t\tDistance Traveled");
		outputWriter.println("-----------------------------");
		for(int hour = 1; hour <= timeTraveled; hour++ ){
			distance1.setNumHours(hour);
			outputWriter.println(hour + " \t\t "+ distance1.getDistance());
		}
		outputWriter.close();
	}

}
