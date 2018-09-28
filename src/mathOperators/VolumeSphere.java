package mathOperators;
import java.util.Scanner;
public class VolumeSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		double volume = 0.0;
		System.out.println("What is the radius of the sphere in cm?");
		radius = input.nextDouble();
		volume = radius*radius*radius*Math.PI*4.0/3.0;
		System.out.println("The volume of the sphere is " + volume);
	}

}
