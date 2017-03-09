import javax.swing.JOptionPane;
public class HotelLauncher {

	public static void main(String[] args) {
		double numFloors;
		double numOccupied = 0;
		double roomsTotal = 0;
		double roomsOccupiedTotal = 0;
		double rooms;
		double roomsOccupied;
		
		
		numFloors = Double.parseDouble(JOptionPane.showInputDialog("how many number of floors are there:"));
		while(numFloors <=1){
			numFloors = Double.parseDouble(JOptionPane.showInputDialog("Please enter a valid value for the number of floors:"));
		
			
		}
		for(int i = 1; i <= numFloors; i++){
			rooms = Double.parseDouble(JOptionPane.showInputDialog("How many rooms are on floor " + i));
			while(rooms <10){
				rooms = Double.parseDouble(JOptionPane.showInputDialog("Enter a valid value for number of rooms " + i));
				
			}
			roomsTotal += rooms;
			roomsOccupied = Double.parseDouble(JOptionPane.showInputDialog("how many rooms are occupied on floor " + i));	
			roomsOccupiedTotal += roomsOccupied;
			
		}
		HotelOccupancy occupant1 = new HotelOccupancy(roomsTotal, roomsOccupiedTotal);
		JOptionPane.showMessageDialog(null, "The number of rooms in the hotel is " + occupant1.getTotalRooms() + 
				"\n" + "the number of rooms occupied is " + occupant1.getTotalOccupied() + 
				" \nthe occupancy rate of the hotel is  " + occupant1.getOccupancyRate()+ "%");
		System.exit(0);
		
		
		
	}
	
	

}
