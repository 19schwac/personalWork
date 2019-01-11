package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
private double trapHeight;
	public Trapezoid(){
		sets1(3);
		sets2(5);
		sets3(3);
		sets4(2);
		trapHeight = 3;
	}
	public Trapezoid(double length1, double length2, double top, double bottom, double newHeight){
		super(length1, top, length2, bottom);
		trapHeight = newHeight;
	}
	public double perimeter(){
		double side1 = gets1();
		double top = gets2();
		double side2 = gets3();
		double bottom = gets4();
		return side1+side2+top+bottom;
	}
	public double area(){
		double side1 = gets1();
		double top = gets2();
		double side2 = gets3();
		double bottom = gets4();
		return ((top+bottom)*trapHeight)/2;
	}
	public void setHeight(double newTrapHeight){
		trapHeight= newTrapHeight;
	}
	public double getHeight(){
		return trapHeight;
	}
}
