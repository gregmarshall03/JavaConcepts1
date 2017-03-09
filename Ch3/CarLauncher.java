
public class CarLauncher {




	public static void main(String[] args) {
		Car car = new Car(2008, "Nissan Altima");
		for (int i = 0; i < 5; i++){
			car.accelerate();
			System.out.println("The current speed is " + car.getSpeed() + "mph");
		}
		for (int i = 0; i < 5; i++){
			car.brake();
			System.out.println("The current speed is " + car.getSpeed() + "mph");
		}

	}

}
