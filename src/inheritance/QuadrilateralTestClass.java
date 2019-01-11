package inheritance;

public class QuadrilateralTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(5,5);
		System.out.println("Rec area: " + box.area());
		System.out.println("Rec perimeter: " + box.perimeter());
		Trapezoid chest = new Trapezoid(1,1,3,2,3);
		System.out.println("Trap area: " + chest.area());
		System.out.println("Trap perimeter: " + chest.perimeter());
		Square bed = new Square(5);
		System.out.println("Square Area: " + bed.area());
	}

}
