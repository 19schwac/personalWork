package oop;

public class RightTriangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RightTriangle bob = new RightTriangle();
System.out.println(bob.hypot());
System.out.println(bob.perimeter());
System.out.println(bob.area());
bob = new RightTriangle(3,5);
System.out.println(bob.hypot());
System.out.println(bob.perimeter());
System.out.println(bob.area());
	}

}
