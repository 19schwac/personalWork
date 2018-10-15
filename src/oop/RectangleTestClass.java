package oop;

public class RectangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle bob = new Rectangle();
System.out.println(bob.returnWidth());
bob.changeWidth(5.0);
System.out.println(bob.returnWidth());
System.out.println(bob.returnLength());
bob.changeLength(2.0);
System.out.println(bob.returnLength());
System.out.println(bob.area());
System.out.println(bob.perimeter());
bob = new Rectangle(10, 20);
System.out.println(bob.returnLength());
System.out.println(bob.returnWidth());
System.out.println(bob.area());
System.out.println(bob.perimeter());
	}

}
