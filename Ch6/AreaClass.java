	
public class AreaClass {
	

	public AreaClass() {
		
	}
	
	
	
	/**
	 * a method that accepts radius as a float in the parameter 
	 * and returns math times radius times radius
	 * @param radius
	 * @return
	 */
	public static double getAreaCircle(float radius){
		System.out.println("radius " + radius);
		
		return Math.PI * (radius * radius);
	}
	
	
	/**
	 *  method that accepts length and width as parameters and returns
	the math of length times width */
	public static double getAreaRectangle(double width, double length){
		return length * width;
		
	}
	
	
	/**a method that accepts height and and radius as parameters and returns
	pie times radius times radius time height*/
	public static double getAreaCylinder(double height, float radius){
		return Math.PI*(radius * radius) * height;
	}

}
