import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Nonservices extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField LABORCHARGE;
	private JTextField PARTSCHARGE;

	public Nonservices() {
		//System.out.println("it is working");
		setLayout(new GridLayout(2,1));
		PARTSCHARGE = new JTextField("Parts Charge:");
		LABORCHARGE = new JTextField("Hours of Labor:");
			add(PARTSCHARGE);
			add(LABORCHARGE);
			setVisible(true);
	}
	
	

	private void add(JTextField lABORCHARGE2) {
		// TODO Auto-generated method stub
		
	}

	private void setLayout(GridLayout gridLayout) {
		
	}

}

