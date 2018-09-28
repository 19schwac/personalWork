package mathOperators;
import java.util.Scanner;
public class StickyNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height = 0.0;
		double length = 0.0;
		double stickyNotes = 0.0;
		System.out.println("What is the height of the rectangular surface in inches?");
		height = input.nextDouble();
		System.out.println("What is the length of the rectangular surface in inches?");
		length = input.nextDouble();
		stickyNotes = (height*length)/9;
		System.out.println("You will need " + stickyNotes + " sticky notes to cover the board.");
			
		
	}

}
