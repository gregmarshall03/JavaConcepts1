
public class FatGram {
	private double NumCalories;
	private double fatGrams;

	public FatGram() {
		// TODO Auto-generated constructor stub
	}

	public double getNumCalories() {
		return NumCalories;
	}

	public void setNumCalories(double numCalories) {
		NumCalories = numCalories;
	}

	public double getFatGrams() {
		return fatGrams;
	}

	public void setFatGrams(double fatGrams) {
		this.fatGrams = fatGrams;
	}
	
	public double getCaloriesFromFat(){
		double caloriesFromFat;
		caloriesFromFat = getFatGrams() * 9;
		return caloriesFromFat;
	}
	public String  getPercentage(){
		double percentCaloriesFromFat;
		percentCaloriesFromFat = getCaloriesFromFat()/getNumCalories();
		String message = "";
		if(percentCaloriesFromFat< 0.3){
		message = "Your food item is low on fat. It is " + percentCaloriesFromFat + " percent fat"; 
		} else{
			message = "the percent of fat in your food item is " + percentCaloriesFromFat;
		}
		return message;
	}

	
}
//