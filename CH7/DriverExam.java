
public class DriverExam {

	public DriverExam() {
		
	}
	
	char[] correctAnswers = {'b', 'd', 'a', 'a', 'c', 'a', 'b', 'a', 'c', 'd', 'b', 'c', 'd', 'a', 'd', 'c', 'c', 'b', 'd', 'a'};
	private char[] studentAnswers = new char[20]; 



	public char[] getStudentAnswers() {
		return studentAnswers;
	}

	public void setStudentAnswers(char[] studentAnswers) {
		this.studentAnswers = studentAnswers;
	}

	public  boolean PassTest(){
	boolean passed = false;
	if(this.answersCorrect() >= 15){
		passed = true;
	}

	return passed;
}

	public  int answersCorrect(){
	int correct = 0;
	for(int i = 0; i < correctAnswers.length; i++){
		if(correctAnswers[i] == this.getStudentAnswers()[i]){
			correct++;
		}
	}
	return correct;
}


	public  int incorrectAnswers(){
	int incorrect = 0;
	for(int i = 0; i < correctAnswers.length; i++){
		if(correctAnswers[i] != this.getStudentAnswers()[i]){
			incorrect++;
		}
	}
	
	
	return incorrect;

}

	public  int[] missedQuestions(){
	int[] missed = new int[correctAnswers.length];
	for(int i = 0; i < correctAnswers.length; i++){
		if(correctAnswers[i]!= this.getStudentAnswers()[i]){
			missed[i] = i + 1;
		}
	}
	
	
	return missed;
}

	public String toString(){
		String str;
		str = "Student Passed: " + this.PassTest() + "\n" +
				"Total Correct: " + this.answersCorrect() + "\n" +
				"Total Incorrect: " + this.incorrectAnswers() + "\n" +
				"Questions Missed:" + this.missedQuestions();
		
		return str;
	}
		
	}


