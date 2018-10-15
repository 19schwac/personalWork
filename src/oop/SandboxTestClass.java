package oop;
import java.util.Scanner;
public class SandboxTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Sandbox child = new Sandbox();
		child.sandbox1();
		System.out.println("What is the length of the sandbox in feet?");
		double length = input.nextDouble();
		System.out.println("What is the width of the sandbox in feet?");
		double width = input.nextDouble();
		System.out.println("What is the depth of the sandbox in feet?");
		double depth = input.nextDouble();
		System.out.println("How much sand can you carry in cubic feet per hour?");
		double rate = input.nextDouble();
		child.sandbox2(length, width, depth, rate);
		System.out.println("What is the length of the sandbox in feet?");
		double length1 = input.nextDouble();
		System.out.println("What is the width of the sandbox in feet?");
		double width1 = input.nextDouble();
		System.out.println("What is the depth of the sandbox in feet?");
		double depth1 = input.nextDouble();
		System.out.println("How much sand can you carry in cubic feet per hour?");
		double rate1 = input.nextDouble();
		double time = child.sandbox3(length1, width1, depth1, rate1);
		System.out.println("It will take you " + time + " hours to fill the sandbox.");
	}

}
