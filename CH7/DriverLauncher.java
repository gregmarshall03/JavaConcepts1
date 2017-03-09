import javax.swing.JOptionPane;

public class DriverLauncher {

	public static void main(String[] args) {
		char[] studentAnswers = new char[20];
		DriverExam exam1 = new DriverExam();
		for(int i= 0; i < studentAnswers.length; i++){
			do{
				studentAnswers[i] = JOptionPane.showInputDialog("Enter the students answers for question" + (i + 1)).charAt(0);
				if(studentAnswers[i] != 'a' && studentAnswers[i] != 'b' &&studentAnswers[i] != 'c' &&studentAnswers[i] != 'd'){
					JOptionPane.showMessageDialog(null, "your answers should be a lower case a,b,c or d");
					
				}
			} while(studentAnswers[i] != 'a' && studentAnswers[i] != 'b' &&studentAnswers[i] != 'c' &&studentAnswers[i] != 'd');
		}
		JOptionPane.showMessageDialog(null, exam1);
		

}


}
