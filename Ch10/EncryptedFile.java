import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EncryptedFile {

	public static void main(String[] args) throws IOException {
	String uncrypted = ""; // a empty string that set to a uncrypted variable
	String encrypted = "";  //a empty string that set to a crypted variable
	char ch; // a instance that creates a char
	
	System.out.println("Reading from file"); // a print line that states the file is being read from
	
	File file = new File("c:\\users\\Greg\\desktop\\greg.txt"); //instance of a old file that was created
	
	Scanner input = new Scanner(file); // scanner that accpets the instance of file in its parameter
	
	while(input.hasNext()){
		// while statement that reads each line in the uncrypted file
		uncrypted += input.nextLine();
	}
	
	for(int i = 0; i < uncrypted.length(); i++){
		/* a for statement that increments the length of the
		 * uncrypted file until it reaches the length
		 * and sets the char ch to the uncrypted file for every
		 * position of sub(i) and adds five as the number for each char
		 */
		ch = uncrypted.charAt(i);
		encrypted += (char)(ch + 5);
		
	}
	System.out.println("Writing to the file"); // println that shows that the file is being written to
	
	//creates a instance of the new file and sets the destination
	FileWriter file2 = new FileWriter("c:\\users\\Greg\\desktop\\greg2.txt",true);
	
	PrintWriter output = new PrintWriter(file2);
	output.println(encrypted); // prints the encrypted contents to the new file
	output.close(); //closes the file

	}

}
