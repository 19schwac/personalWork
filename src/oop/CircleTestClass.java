package oop;

public class CircleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle bob = new Circle();
System.out.println(bob.getRadius());
bob.setRadius(1.0);
System.out.println(bob.circumference());
System.out.println(bob.area());

bob = new Circle(20);
System.out.println(bob.getRadius());
System.out.println(bob.circumference());
System.out.println(bob.area());
bob.setRadius(1.0);
System.out.println(bob.getRadius());
	}

}
