package oop;

import java.util.Scanner;

public class House {

	public House(){
}
	public void area(){
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double height = 0.0;
		System.out.println("What is the length of the wall in feet?");
		length = input.nextDouble();
		System.out.println("What is the height of the wall in feet?");
		height = input.nextDouble();
		double area = length*height;
		double time = area/200.0;
		System.out.println("The time is takes to paint the wall is " + time + " hours.");
	}
}
