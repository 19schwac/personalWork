package oop;
import java.util.Scanner;
public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
Rectangle bob = new Rectangle();
System.out.println("What is the length of the rectangle in feet?");
double length = input.nextDouble();
System.out.println("What is the width of the rectangle in feet?");
double width = input.nextDouble();
bob.returnLength();
bob.returnWidth();
bob.changeLength(length);
bob.changeWidth(width);
System.out.println("Rectangle Area: " + bob.area());
System.out.println("Rectangle Perimeter: " + bob.perimeter());
Circle fred = new Circle();
System.out.println("What is the radius of a circle in feet?");
double radius = input.nextDouble();
fred.getRadius();
fred.setRadius(radius);
System.out.println("Circle Area: " + fred.area());
System.out.println("Circle Circumference: " + fred.circumference());
RightTriangle joe = new RightTriangle();
System.out.println("What is the base of the triangle in feet?");
double base = input.nextDouble();
System.out.println("What is the height of the height in feet?");
double height = input.nextDouble();
joe = new RightTriangle(base, height);
System.out.println("Triangle Area: " + joe.area());
System.out.println("Triangle Perimeter: "  + joe.perimeter());
IsoscelesTrapezoid jack = new IsoscelesTrapezoid();
System.out.println("What is the bottom base of the trapezoid in feet?");
double base1 = input.nextDouble();
System.out.println("What is the top base of the trapezoid in feet?");
double base2 = input.nextDouble();
System.out.println("What is the height of the trapezoid in feet?");
double trapezoidHeight = input.nextDouble();
System.out.println("What is the length of the leg of the trapezoid in feet?");
double leg = input.nextDouble();
jack = new IsoscelesTrapezoid(base1,base2,trapezoidHeight,leg);
System.out.println("Trapezoid Area: " + jack.area());
System.out.println("Trapedzoid Perimeter: " + jack.perimeter());



	}

}
