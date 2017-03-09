
public class Essay extends GradedActivity {
	
	double grammar, spelling, correctLength, content;

	public Essay(double grammar,double spelling,double correctLength,double content) {
		this.grammar = grammar;
		this.spelling = spelling;
		this.correctLength = correctLength;
		this.content = content;
	}
	
	
	public double getGrammar() {
		return grammar;
	}

	public void setGrammar(double grammar) {
		this.grammar = grammar;
	}

	public double getSpelling() {
		return spelling;
	}

	public void setSpelling(double spelling) {
		this.spelling = spelling;
	}

	public double getCorrectLength() {
		return correctLength;
	}

	public void setCorrectLength(double correctLength) {
		this.correctLength = correctLength;
	}

	public double getContent() {
		return content;
	}

	public void setContent(double content) {
		this.content = content;
	}
	
	public String toString(){
		String str;
		str = "Grammar:" + this.getGrammar() + "\n" +
		"Spelling:" + this.getSpelling() + "\n" +
		"Correct Length:" + this.getCorrectLength() + "\n" +
		"Content:" + this.getContent();
		
		return str; 
		
	}

	

}
