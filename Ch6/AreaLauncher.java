import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
import java.awt.*;








public class AreaLauncher {

	public static void main(String[] args) {
		double circleRadius; // the radius of the circle
		double rectangleRadius; // the radius of the circle
		double cylinderRadius; // radius of the cylinder
		String Circle = ""; // circle shape
		String Rectangle = ""; //rectangle shape
		String Cylinder = ""; //Cylinder shape
		String userInput; // String to read input
		float radius = 0; // radius instance that is initialized to zero
		double rWidth; // rectangle width
		double rLength; // rectangle length
		double cHeight; // circle height
		float cRadius; //circle radius
		
		
		
		AreaClass area1 = new AreaClass(); // object area created
		
		//ask the user for input of a circle square or cylinder
		
		userInput = JOptionPane.showInputDialog("Please enter one of the following shapes circle,square,cylinder:");
		
		/** a if else statement that determines if the users input is one of the following shapes if so it falls 
		 * into one of the blocks and asks the user for input
		 */
		if(userInput.equalsIgnoreCase("Circle")){
			// ask the user to enter the radius of the circle
			radius = Float.parseFloat(JOptionPane.showInputDialog("Please enter the radius of the circle"));
			
			// sets the cirlceRadius to the area1 object
			circleRadius = area1.getAreaCircle(radius);
			
			// tells the user the are of the circle
			JOptionPane.showMessageDialog(null, "the area of the cirlce is " + area1.getAreaCircle(radius)); 
			
		} else if(userInput.equalsIgnoreCase("Rectangle")){
			
			//ask the users to enter the width
			rWidth = Double.parseDouble(JOptionPane.showInputDialog("Please enter the width of the rectangle"));
			
			// tells the user to enter a length
			rLength = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the rectangle"));
			
			//sets the length and width to the rectanlge radius field
			rectangleRadius = area1.getAreaRectangle(rWidth, rLength);
			
			//tells the user the area of the circle
			JOptionPane.showMessageDialog(null, "The area of the rectangle is " + area1.getAreaRectangle(rWidth, rLength));
		
	}  else if(userInput.equalsIgnoreCase("Cylinder")){
		// ask the user to enter the radius of the circle
		cRadius = Float.parseFloat(JOptionPane.showInputDialog("Please enter the radius of the cylinder"));
		
		// ask the user to enter the height of the cylinder
		cHeight = Double.parseDouble(JOptionPane.showInputDialog("Please enter the height of the cylinder"));
		
		// sets the height and width of the cylinder to area1 object
		area1.getAreaCylinder(cHeight, cRadius);
		
		// tells the user the area of the circle
		JOptionPane.showMessageDialog(null, "The area of the cylinder is " + area1.getAreaCylinder(cHeight, cRadius));
	
		System.exit(0);
		
	}
	
}
}
	
	
		

