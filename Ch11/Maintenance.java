import java.awt.*;
import javax.swing.*;

public class Maintenance extends JPanel {
	public final double oilChange = 26.00;
	public final double lubeJob = 18.00;
	public final double radiatorFlush = 30.00;
	public final double transmissionFlush = 80.00;
	public final double inspection = 15.00;
	public final double mufflerReplacement = 100.00;
	public final double tireRotation = 20.00;
	public final double laborcharge=20.00;
	public final double partcharge=20.00;


	
	//rame frame = new JFrame("Ranken Automotive");
	
	
	
	
	
	
	private JCheckBox OILCHANGE;
	private JCheckBox LUBEJOB;
	private JCheckBox RADIATORFLUSH;
	private JCheckBox TRANSMISSIONFLUSH;
	private JCheckBox INSPECTION;
	private JCheckBox MUFFLERREPLACEMENT;
	private JCheckBox TIREROTATION;
	
	
	
	
	
	
	public Maintenance() {
	setLayout(new GridLayout(7,1));
	OILCHANGE = new JCheckBox("Oil Change");
	LUBEJOB = new JCheckBox("Lube Job");
	RADIATORFLUSH = new JCheckBox("Radiator Flush");
	TRANSMISSIONFLUSH = new JCheckBox("Transmission Flush");
	INSPECTION = new JCheckBox("Inspection");
	MUFFLERREPLACEMENT = new JCheckBox("Muffler Replacement");
	TIREROTATION = new JCheckBox("Tire Rotation");
	setBorder(BorderFactory.createTitledBorder("Routine Services"));
	add(OILCHANGE);
	add(LUBEJOB);
	add(RADIATORFLUSH);
	add(TRANSMISSIONFLUSH);
	add(INSPECTION);
	add(MUFFLERREPLACEMENT);
	add(TIREROTATION);
	}
	
	public double getSelectedOption(){
		double services = 0.0;
		if(OILCHANGE.isSelected())
				services += oilChange;
		if(LUBEJOB.isSelected())
			services += lubeJob;
		if(RADIATORFLUSH.isSelected())
			services += radiatorFlush;
		if(TRANSMISSIONFLUSH.isSelected())
			services += transmissionFlush;
		if(INSPECTION.isSelected())
			services += inspection;
		if(MUFFLERREPLACEMENT.isSelected())
			services += mufflerReplacement;
		if(TIREROTATION.isSelected())
			services += tireRotation;
		return services;
	
	}
	
	

}