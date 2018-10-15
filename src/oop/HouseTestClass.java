package oop;
import java.util.Scanner;
public class HouseTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		House painter = new House();
		painter.area();
		System.out.println("How many rows are in the garden?");
		int row = input.nextInt();
		painter.garden(row);
		System.out.println("What is the radius of the pool in feet?");
		double radius = input.nextDouble();
		System.out.println("What is the height of the pool in feet?");
		double height = input.nextDouble();
		painter.pool(radius, height);
	}

}
