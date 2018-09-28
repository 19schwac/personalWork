package mathOperators;
import java.util.Scanner;
public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = 0.0;
		double area = 0.0;
		System.out.println("What is the radius of the circle cm?");
		radius = input.nextDouble();
		area = radius*radius*3.14;
		System.out.println("The area of the circle is " + area + " cm^2");
	}

}
