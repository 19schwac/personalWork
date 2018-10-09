package oop;
import java.util.Scanner;
public class Sandbox {
	public Sandbox() {
		
	}
	public void sandbox1() {
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double depth = 0.0;
		double width = 0.0;
		double rate = 0.0;
		System.out.println("What is the length of the sandbox in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the sandbox in feet?");
		width = input.nextDouble();
		System.out.println("What is the depth of the sandbox in feet?");
		depth = input.nextDouble();
		System.out.println("How much sand can you carry in cubic feet per hour?");
		rate = input.nextDouble();
		double volume = length*width*depth;
		double time = volume/rate;
		System.out.println("It will take you " + time + " hours to fill the sandbox.");
		}
	public void sandbox2(double length, double width, double depth, double rate) {
		double volume = length*width*depth;
		double time = volume/rate;
		System.out.println("It will take you " + time + " hours to fill the sandbox.");
	}
	public double sandbox3(double length, double width, double depth, double rate) {
	double volume = length*width*depth;
	double time = volume/rate;
	return time;
}
}
