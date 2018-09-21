package mathOperators;
import java.util.Scanner;
public class AreaOfWall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int height = 8;
		int width = 0;
		int area = 0;
		System.out.println("What is the width of the wall in feet?");
		width = input.nextInt();
		area = width*height;
		System.out.println("The area of the wall is " + area + " square feet");
	}

}
