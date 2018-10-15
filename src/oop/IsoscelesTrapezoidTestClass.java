package oop;

public class IsoscelesTrapezoidTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IsoscelesTrapezoid bob = new IsoscelesTrapezoid();
System.out.println(bob.perimeter());
System.out.println(bob.area());
bob = new IsoscelesTrapezoid(1.0,2.0,3.0,4.0);
System.out.println(bob.perimeter());
System.out.println(bob.area());
	}

}
