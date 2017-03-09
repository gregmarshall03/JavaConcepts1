import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
public class ServicesCalculator extends JFrame {
	private Maintenance services;
	private Nonservices otherservice;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	public final double laborcharge=20.00;
	public final double partcharge=20.00;

	public ServicesCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		services = new Maintenance();
		otherservice = new Nonservices();
		
		buildButtonPanel();
		
		add(services, BorderLayout.NORTH);
		add(otherservice, BorderLayout.WEST);
		//add(buttonPanel, BorderLayout.);
		
		pack();
		setVisible(true);
	}
	
	private void add(Nonservices nonservices2, String center) {
		// TODO Auto-generated method stub
		
	}

	private void buildButtonPanel(){
		buttonPanel = new JPanel();
		calcButton = new JButton("Calculate");
		exitButton = new JButton("exit");
		calcButton.addActionListener(new calcButtonListener());
		exitButton.addActionListener(new exitButtonListener());
		
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
		
	}
	
	private class calcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double subtotal, realtotal;
			//subtotal = services.getSelectedOption() + otherservice.
		}
	}
	
	private class exitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args){
		new ServicesCalculator();
	}

}










