

public class DistanceFile {
	private double speed;
	private double numHours;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getNumHours() {
		return numHours;
	}

	public void setNumHours(double numHours) {
		this.numHours = numHours;
	}

	public DistanceFile() {
		// TODO Auto-generated constructor stub
	}

	public double getDistance(){
		return speed * numHours;
		
	}

	}


