package oop;
import java.util.Scanner;
public class Room {

	public Room() {
		
	}
public void area(){
	Scanner input = new Scanner(System.in);
	double length = 0.0;
	double height = 0.0;
	double area = 0.0;
	System.out.println("What is the length of the wall in feet?");
	length = input.nextDouble();
	System.out.println("What is the height of the wall in feet?");
	height = input.nextDouble();
	area = length*height;
	System.out.println("The area of the wall is " + area + " feet squared.");
}
public void areaWithDoor(){
	Scanner input = new Scanner(System.in);
	double length = 0.0;
	double height = 0.0;
	double doorHeight = 0.0;
	double doorLength = 0.0;
	double area = 0.0;
	double areaDoor = 0.0;
	double areaWithoutDoor = 0.0;
	System.out.println("What is the length of the wall in feet?");
	length = input.nextDouble();
	System.out.println("What is the height of the wall in feet?");
	height = input.nextDouble();
	System.out.println("What is the length of the door in feet?");
	doorLength = input.nextDouble();
	System.out.println("What is the height of the door in feet?");
	doorHeight = input.nextDouble();
	area = length*height;
	areaDoor = doorLength*doorHeight;
	areaWithoutDoor = area-areaDoor;
	System.out.println("The area of the wall without the door is " + areaWithoutDoor + " feet sqaured.");
}
}

