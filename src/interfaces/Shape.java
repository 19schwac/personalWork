package interfaces;
import java.util.Scanner;
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is the length of the rectangle?");
int length = input.nextInt();
System.out.println("What is the width of the rectangle?");
int width = input.nextInt();
InterfaceNumeroUno bob = new Rectangle(length, width);
System.out.println("Perimeter: " + bob.perimeter());
System.out.println("Area: " + bob.area());
System.out.println("What is the radius?");
int radius = input.nextInt();
InterfaceNumeroUno larry = new Circle(radius);
System.out.println(larry.perimeter());
}

}
