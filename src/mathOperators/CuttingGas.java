package mathOperators;
import java.util.Scanner;
public class CuttingGas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double radius = 0.0;
		double areaOfYard = 0.0;
		double areaOfFountain = 0.0;
		double lawn = 0.0;
		double money = 0.0;
		System.out.println("What is the length of your yard in yards?");
		length = input.nextDouble();
		System.out.println("What is the width of your yard in yards?");
		width = input.nextDouble();
		System.out.println("What is the radius of your fountain in feet?");
		radius = input.nextDouble();
		areaOfFountain = Math.PI*Math.pow(radius,2.0);
		areaOfYard = length*width*3.0;
		lawn = areaOfYard-areaOfFountain;
		money = 1.25*lawn/100;
		System.out.println("You will make $" + money);

	}

}
