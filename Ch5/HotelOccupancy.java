
public class HotelOccupancy {
	private double totalOccupied;
	private double totalRooms;

	public double getTotalOccupied() {
		return totalOccupied;
	}

	public void setTotalOccupied(double totalOccupied) {
		this.totalOccupied = totalOccupied;
	}

	public double getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(double totalRooms) {
		this.totalRooms = totalRooms;
	}

	public HotelOccupancy(double roomsTotal, double roomsOccupiedTotal) {
		this.totalRooms = roomsTotal;
		this.totalOccupied = roomsOccupiedTotal;
	}
	
	public double getOccupancyRate(){
		return ((totalOccupied/totalRooms) * 100);
		
	}

}
