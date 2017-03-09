
public class Geometry {

	/* method that stores radius as a double in the parameter and returns
	 the math to find out the radius of a circle
	 */
	public static double getRadiusOfCircle(double radius){
		return Math.PI * radius * radius;
		
	}
	
	/* method that accepts width and length as parameters and returns 
	 the area which is the length times the width
	 */
	public static double getRectangleArea(double length, double width){
		return length * width;
		
	}
	
	/* method that gets the area of a triangle
	 sets the length and width as doubles and returns height times 0.05
	 */
	public static double getTriangleArea(double length, double height){
		return height * 0.05;
		
		
	}

}
