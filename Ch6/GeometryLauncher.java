import java.util.Scanner;
public class GeometryLauncher {

	public static void main(String[] args) {
		
		System.out.println("Geometry Calculator");
		// ask user to select number one if they want circle
		System.out.println("1) " + "Calculate the area of the circle");
		
		// ask user to select number one if they want rectangle
		System.out.println("2) " + "Calculate the area of the rectangle");
		
		// ask user to select number one if they want triangle
		System.out.println("3) " + "Calculate the area of the triangle");
		
		// ask user to hit four if the want to quit the program
		System.out.println("4) " + "Quit");
		
		int userInput; // variable for the user input
		double radius; // variable for radius
		double width; // variable for height
		double length = 0; //variable for length
		double height; // variable for height
		double base;  // variable for base
	
		// creates scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// ask the user to select one of the numnbers in order to see which calculation will be done
		System.out.println("Enter your choice 1-4");
		userInput = keyboard.nextInt();
		
		/**a while loop that will show a message to enter a valid 
		 * value if the users input is below one
		 */
		while(userInput < 1 ||  userInput > 4){
			System.out.println("Enter a valid value:");
			userInput = keyboard.nextInt();
		} if(userInput == 1){
			System.out.println("What is the radius of the cirlce");
			radius = keyboard.nextDouble();
			Geometry.getRadiusOfCircle(radius);
			System.out.println("The are of the circle is " + Geometry.getRadiusOfCircle(radius));
			
		}
			/**  if statement to see if users input is equal to two */
			if(userInput == 2){
				System.out.println("What is the length:");
				length = keyboard.nextDouble();
				System.out.println("What is the width of the rectangle");
				width = keyboard.nextDouble();
				Geometry.getRectangleArea(length, width);
				System.out.println("The are of the rectangle is " + Geometry.getRectangleArea(length, width));
			
				
				
			}
			 
			/** if statement that sees if the userinput is equal 
			  * to 3 if so runs the to statements inside
			  */
		if(userInput==3){
			System.out.println("What is the base of the triangle:");
			base = keyboard.nextDouble();
			System.out.println("What is the height of the triangle:");
			height = keyboard.nextDouble();
			Geometry.getTriangleArea(length, height);
			System.out.println("The are of the triangle is " + Geometry.getTriangleArea(length, height));
			
		
			
		}	/** if statement that determines 
		if the user input is equal to four if so the statement will print out */
			if(userInput==4){
				System.out.println("You have exited the program");
			
				
			}
		
		
		
		

	}
	
	

}

