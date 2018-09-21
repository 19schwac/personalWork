package mathOperators;
import java.util.Scanner;
public class VolumeBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double height = 0.0;
		double width = 0.0;
		double volume = 0.0;
		System.out.println("What is the length of the box in cm?");
		length = input.nextDouble();
		System.out.println("What is the height of the box in cm?");
		height = input.nextDouble();
		System.out.println("What is the width of the box in cm?");
		width = input.nextDouble();
		volume = length*height*width;
		System.out.println("The volume of the box is " + volume + " cm^3");
	}

}
