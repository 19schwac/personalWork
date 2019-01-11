package inheritance;

public class Rectangle extends Paralleogram implements Geo{

	public Rectangle(){
		super();
	}
	public Rectangle(double length, double width){
		super(length, width, width);
	}
	public double area(){
		double length = gets1();
		double width = gets3();
		double area = length*width;
		return area;
	}
}
