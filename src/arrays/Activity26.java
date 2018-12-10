package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<CircleClass> circle = new ArrayList<CircleClass>();
		final int CIRCLES = 10;
		for (int i = 0; i <= CIRCLES-1; i++){
			
			System.out.println("What is the radius of the circle?");
			circle.add(new CircleClass(input.nextDouble()));
		}
		for (CircleClass x: circle){
			System.out.println("Area of Circle: " + x.area());
		}
	}

}
