package mathOperators;
import java.util.Scanner;
public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double HEIGHT = 8.0;
		double length = 0.0;
		double width = 0.0;
		double areaOfWall = 0.0;
		double gallon = 0.0;
		System.out.println("What is the length of the room in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the room in feet?");
		width = input.nextDouble();
		System.out.println("Height: " + HEIGHT +
				"\nLength: " + length +
				"\nWidth: " + width 
				);
		areaOfWall = HEIGHT*length*2+HEIGHT*width*2;
		System.out.println("Area of wall: " + areaOfWall);
		gallon = areaOfWall/150;
		System.out.println("Gallons of paint: " + gallon);
	}

}
