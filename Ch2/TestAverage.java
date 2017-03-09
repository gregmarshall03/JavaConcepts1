import java.util.Scanner;
public class TestAverage {

	

	public static void main(String[] args) {
		double testAverage;
		int firstscore;
		int secondscore;
		int thirdscore;
		
		Scanner testone = new Scanner(System.in);
		System.out.println("Enter first test score here : ");
		firstscore = testone.nextInt();
		Scanner testtwo = new Scanner(System.in);
		System.out.print("Enter second test score here : ");
		secondscore = testtwo.nextInt();
		Scanner testthree = new Scanner(System.in);
		System.out.println("Enter last test score : "  );
		thirdscore = testthree.nextInt();
		testAverage = (firstscore + secondscore + thirdscore)/3;
		System.out.println("your avergae is : " + testAverage);
		
		
		



	}

}
